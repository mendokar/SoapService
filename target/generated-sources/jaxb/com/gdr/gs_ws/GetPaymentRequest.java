//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.13 a las 05:01:27 PM COT 
//


package com.gdr.gs_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valorPago" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "refPago",
    "fechaPago",
    "valorPago"
})
@XmlRootElement(name = "getPaymentRequest")
public class GetPaymentRequest {

    @XmlElement(required = true)
    protected String refPago;
    @XmlElement(required = true)
    protected String fechaPago;
    @XmlElement(required = true)
    protected String valorPago;

    /**
     * Obtiene el valor de la propiedad refPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPago() {
        return refPago;
    }

    /**
     * Define el valor de la propiedad refPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefPago(String value) {
        this.refPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorPago() {
        return valorPago;
    }

    /**
     * Define el valor de la propiedad valorPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorPago(String value) {
        this.valorPago = value;
    }

}
