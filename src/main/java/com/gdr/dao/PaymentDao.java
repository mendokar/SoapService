package com.gdr.dao;


import com.gdr.gs_ws.IdPersona;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

@Entity
@Table(name = "payment")
public class PaymentDao {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String respuestaCodigo;
    private String respuestaMensaje;
    private String codConcepto;
    private String pagoEsperado;
    private String identificacionPersona;
    private String idPersona;
    private String razonSocial;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccionContacto;
    private String nomPais;
    private String nomDepartamento;
    private String nomMunicipio;
    private String numTelefonoContacto;
    private String numCelularContacto;
    private String correoElectronicoContacto;

    public PaymentDao() {
    }

    public String getRespuestaCodigo() {
        return respuestaCodigo;
    }

    public void setRespuestaCodigo(String respuestaCodigo) {
        this.respuestaCodigo = respuestaCodigo;
    }

    public String getRespuestaMensaje() {
        return respuestaMensaje;
    }

    public void setRespuestaMensaje(String respuestaMensaje) {
        this.respuestaMensaje = respuestaMensaje;
    }

    public String getCodConcepto() {
        return codConcepto;
    }

    public void setCodConcepto(String codConcepto) {
        this.codConcepto = codConcepto;
    }

    public String getPagoEsperado() {
        return pagoEsperado;
    }

    public void setPagoEsperado(String pagoEsperado) {
        this.pagoEsperado = pagoEsperado;
    }

    public String getIdentificacionPersona() {
        return identificacionPersona;
    }

    public void setIdentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccionContacto() {
        return direccionContacto;
    }

    public void setDireccionContacto(String direccionContacto) {
        this.direccionContacto = direccionContacto;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getNomDepartamento() {
        return nomDepartamento;
    }

    public void setNomDepartamento(String nomDepartamento) {
        this.nomDepartamento = nomDepartamento;
    }

    public String getNomMunicipio() {
        return nomMunicipio;
    }

    public void setNomMunicipio(String nomMunicipio) {
        this.nomMunicipio = nomMunicipio;
    }

    public String getNumTelefonoContacto() {
        return numTelefonoContacto;
    }

    public void setNumTelefonoContacto(String numTelefonoContacto) {
        this.numTelefonoContacto = numTelefonoContacto;
    }

    public String getNumCelularContacto() {
        return numCelularContacto;
    }

    public void setNumCelularContacto(String numCelularContacto) {
        this.numCelularContacto = numCelularContacto;
    }

    public String getCorreoElectronicoContacto() {
        return correoElectronicoContacto;
    }

    public void setCorreoElectronicoContacto(String correoElectronicoContacto) {
        this.correoElectronicoContacto = correoElectronicoContacto;
    }
}
