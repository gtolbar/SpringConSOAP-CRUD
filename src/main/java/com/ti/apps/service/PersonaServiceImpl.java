package com.ti.apps.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ti.apps.dao.IPersonaRepository;
import com.ti.apps.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	private static final Logger logger =LogManager.getLogger(PersonaServiceImpl.class);
	
	@Autowired
	IPersonaRepository repo;
	
	@Override
	public Persona ListarPorId(Integer id) {
		return repo.getCollaborator(id);
	}

	@Override
	public List<Persona> listarTodos() {
		List<Persona> list = repo.getListAllCollaborator();
		logger.info("El tamaño de la lista es de : " + list.size());
		return list;
	}

}
