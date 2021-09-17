//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.16 a las 10:39:19 PM COT 
//


package com.gdr.gs_ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gdr.gs_ws package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gdr.gs_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaymentRequest }
     * 
     */
    public GetPaymentRequest createGetPaymentRequest() {
        return new GetPaymentRequest();
    }

    /**
     * Create an instance of {@link GetPaymentResponse }
     * 
     */
    public GetPaymentResponse createGetPaymentResponse() {
        return new GetPaymentResponse();
    }

    /**
     * Create an instance of {@link Payment }
     * 
     */
    public Payment createPayment() {
        return new Payment();
    }

}
