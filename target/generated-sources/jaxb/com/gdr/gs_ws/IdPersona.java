//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.16 a las 10:39:19 PM COT 
//


package com.gdr.gs_ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para idPersona.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="idPersona"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CD"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PEP"/&gt;
 *     &lt;enumeration value="NUIP"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="NIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "idPersona")
@XmlEnum
public enum IdPersona {

    CC,
    CD,
    CE,
    PA,
    PEP,
    NUIP,
    TI,
    NIT;

    public String value() {
        return name();
    }

    public static IdPersona fromValue(String v) {
        return valueOf(v);
    }

}
