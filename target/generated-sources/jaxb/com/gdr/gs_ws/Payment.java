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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para payment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuestaCodigo" type="{http://spring.io/guides/gs-producing-web-service}respuestaCodigo"/&gt;
 *         &lt;element name="respuestaMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codConcepto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pagoEsperado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificacionPersona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idPersona" type="{http://spring.io/guides/gs-producing-web-service}idPersona"/&gt;
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primerNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="segundoNombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccionContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomPais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomDepartamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numTelefonoContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numCelularContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="correoElectronicoContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment", propOrder = {
    "respuestaCodigo",
    "respuestaMensaje",
    "codConcepto",
    "pagoEsperado",
    "identificacionPersona",
    "idPersona",
    "razonSocial",
    "primerNombre",
    "segundoNombre",
    "primerApellido",
    "segundoApellido",
    "direccionContacto",
    "nomPais",
    "nomDepartamento",
    "nomMunicipio",
    "numTelefonoContacto",
    "numCelularContacto",
    "correoElectronicoContacto"
})
public class Payment {

    @XmlElement(required = true)
    protected String respuestaCodigo;
    @XmlElement(required = true)
    protected String respuestaMensaje;
    @XmlElement(required = true)
    protected String codConcepto;
    @XmlElement(required = true)
    protected String pagoEsperado;
    @XmlElement(required = true)
    protected String identificacionPersona;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IdPersona idPersona;
    @XmlElement(required = true)
    protected String razonSocial;
    @XmlElement(required = true)
    protected String primerNombre;
    @XmlElement(required = true)
    protected String segundoNombre;
    @XmlElement(required = true)
    protected String primerApellido;
    @XmlElement(required = true)
    protected String segundoApellido;
    @XmlElement(required = true)
    protected String direccionContacto;
    @XmlElement(required = true)
    protected String nomPais;
    @XmlElement(required = true)
    protected String nomDepartamento;
    @XmlElement(required = true)
    protected String nomMunicipio;
    @XmlElement(required = true)
    protected String numTelefonoContacto;
    @XmlElement(required = true)
    protected String numCelularContacto;
    @XmlElement(required = true)
    protected String correoElectronicoContacto;

    /**
     * Obtiene el valor de la propiedad respuestaCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaCodigo() {
        return respuestaCodigo;
    }

    /**
     * Define el valor de la propiedad respuestaCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaCodigo(String value) {
        this.respuestaCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad respuestaMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaMensaje() {
        return respuestaMensaje;
    }

    /**
     * Define el valor de la propiedad respuestaMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaMensaje(String value) {
        this.respuestaMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codConcepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConcepto() {
        return codConcepto;
    }

    /**
     * Define el valor de la propiedad codConcepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConcepto(String value) {
        this.codConcepto = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoEsperado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagoEsperado() {
        return pagoEsperado;
    }

    /**
     * Define el valor de la propiedad pagoEsperado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagoEsperado(String value) {
        this.pagoEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Define el valor de la propiedad identificacionPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionPersona(String value) {
        this.identificacionPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad idPersona.
     * 
     * @return
     *     possible object is
     *     {@link IdPersona }
     *     
     */
    public IdPersona getIdPersona() {
        return idPersona;
    }

    /**
     * Define el valor de la propiedad idPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link IdPersona }
     *     
     */
    public void setIdPersona(IdPersona value) {
        this.idPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad razonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Define el valor de la propiedad razonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad primerNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerNombre() {
        return primerNombre;
    }

    /**
     * Define el valor de la propiedad primerNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerNombre(String value) {
        this.primerNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * Define el valor de la propiedad segundoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoNombre(String value) {
        this.segundoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimerApellido(String value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegundoApellido(String value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionContacto() {
        return direccionContacto;
    }

    /**
     * Define el valor de la propiedad direccionContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionContacto(String value) {
        this.direccionContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomPais() {
        return nomPais;
    }

    /**
     * Define el valor de la propiedad nomPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomPais(String value) {
        this.nomPais = value;
    }

    /**
     * Obtiene el valor de la propiedad nomDepartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDepartamento() {
        return nomDepartamento;
    }

    /**
     * Define el valor de la propiedad nomDepartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDepartamento(String value) {
        this.nomDepartamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nomMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomMunicipio() {
        return nomMunicipio;
    }

    /**
     * Define el valor de la propiedad nomMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomMunicipio(String value) {
        this.nomMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad numTelefonoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTelefonoContacto() {
        return numTelefonoContacto;
    }

    /**
     * Define el valor de la propiedad numTelefonoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTelefonoContacto(String value) {
        this.numTelefonoContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad numCelularContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCelularContacto() {
        return numCelularContacto;
    }

    /**
     * Define el valor de la propiedad numCelularContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCelularContacto(String value) {
        this.numCelularContacto = value;
    }

    /**
     * Obtiene el valor de la propiedad correoElectronicoContacto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoElectronicoContacto() {
        return correoElectronicoContacto;
    }

    /**
     * Define el valor de la propiedad correoElectronicoContacto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoElectronicoContacto(String value) {
        this.correoElectronicoContacto = value;
    }

}
