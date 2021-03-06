//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.06.25 at 12:17:40 AM COT 
//


package com.ti.apps.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ti.apps.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersonaRequest_QNAME = new QName("http://www.example.org/Persona", "personaRequest");
    private final static QName _PersonaFault_QNAME = new QName("http://www.example.org/Persona", "personaFault");
    private final static QName _PersonaResponse_QNAME = new QName("http://www.example.org/Persona", "personaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ti.apps.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonaRequest }
     * 
     */
    public PersonaRequest createPersonaRequest() {
        return new PersonaRequest();
    }

    /**
     * Create an instance of {@link PersonaDetails }
     * 
     */
    public PersonaDetails createPersonaDetails() {
        return new PersonaDetails();
    }

    /**
     * Create an instance of {@link PersonaResponse }
     * 
     */
    public PersonaResponse createPersonaResponse() {
        return new PersonaResponse();
    }

    /**
     * Create an instance of {@link PersonaFault }
     * 
     */
    public PersonaFault createPersonaFault() {
        return new PersonaFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Persona", name = "personaRequest")
    public JAXBElement<PersonaRequest> createPersonaRequest(PersonaRequest value) {
        return new JAXBElement<PersonaRequest>(_PersonaRequest_QNAME, PersonaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Persona", name = "personaFault")
    public JAXBElement<PersonaFault> createPersonaFault(PersonaFault value) {
        return new JAXBElement<PersonaFault>(_PersonaFault_QNAME, PersonaFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Persona", name = "personaResponse")
    public JAXBElement<PersonaResponse> createPersonaResponse(PersonaResponse value) {
        return new JAXBElement<PersonaResponse>(_PersonaResponse_QNAME, PersonaResponse.class, null, value);
    }

}
