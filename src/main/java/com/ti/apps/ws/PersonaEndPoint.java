package com.ti.apps.ws;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ti.apps.entity.Persona;
import com.ti.apps.schema.ObjectFactory;
import com.ti.apps.schema.PersonaDetails;
import com.ti.apps.schema.PersonaRequest;
import com.ti.apps.schema.PersonaResponse;
import com.ti.apps.service.IPersonaService;

@Endpoint
public class PersonaEndPoint<personaResponse> {
	
	private static final String NAMESPACE_URI="http://www.example.org/Persona";

	@Autowired
	IPersonaService service;
	
	@PayloadRoot(namespace=NAMESPACE_URI,localPart = "personaRequest")
	@ResponsePayload
	public JAXBElement<PersonaResponse> getPersona(@RequestPayload JAXBElement<PersonaRequest> request){
		
		ObjectFactory objectFactory = new ObjectFactory();
		PersonaResponse personaResponseFactory= new PersonaResponse();
		JAXBElement<PersonaResponse> personaResponse= objectFactory.createPersonaResponse(personaResponseFactory);
		try {
			String action =  request.getValue().getAction();
			
			if (action.equals("listar")) {
				
				PersonaResponse personaResponseObj = new PersonaResponse();
				
				List<Persona> list = service.listarTodos();
				
				if (list != null) {
					for (Persona persona : list) {
						PersonaDetails personaDetails = new PersonaDetails();
						
						personaDetails.setNombre(persona.getNombre());
						personaDetails.setCel(persona.getCel());
						personaDetails.setId(persona.getId());
						personaResponseObj.getPersonaDetails().add(personaDetails);
					}
										
				}
				
				personaResponse.setValue(personaResponseObj);				
				
			} else if(action.equals("id")){
				
				PersonaResponse personaResponseObj = new PersonaResponse();
				PersonaDetails personaDetails = new PersonaDetails();
				Persona pers = service.ListarPorId(request.getValue().getId());
				
				personaDetails.setNombre(pers.getNombre());
				personaDetails.setCel(pers.getCel());
				personaDetails.setId(pers.getId());
				
				personaResponseObj.getPersonaDetails().add(personaDetails);
				
				personaResponse.setValue(personaResponseObj);
				

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return personaResponse;		
	}

}

