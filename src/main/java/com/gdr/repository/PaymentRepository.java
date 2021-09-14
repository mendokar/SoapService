package com.gdr.repository;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.gdr.gs_ws.IdPersona;
import com.gdr.gs_ws.Payment;

@Component
public class PaymentRepository {
	private static final Map<String, Payment> payments = new HashMap<>();

	@PostConstruct
	public void initData() {
		Payment payment = new Payment();
		payment.setRespuestaCodigo("00");
		payment.setRespuestaMensaje("test");
		payment.setCodConcepto("setCodConcepto");
		payment.setPagoEsperado("setPagoEsperado");
		payment.setIdentificacionPersona("identificacionPersona");
		payment.setIdPersona(IdPersona.CC);
		payment.setRazonSocial("razonSocial");
		payment.setPrimerNombre("primerNombre");
		payment.setSegundoNombre("segundoNombre");
		payment.setPrimerApellido("primerApellido");
		payment.setSegundoApellido("segundoApellido");
		payment.setDireccionContacto("direccionContacto");
		payment.setNomPais("nomPais");
		payment.setNomDepartamento("nomDepartamento");
		payment.setNomMunicipio("nomMunicipio");
		payment.setNumTelefonoContacto("numTelefonoContacto");
		payment.setNumCelularContacto("numCelularContacto");
		payment.setCorreoElectronicoContacto("correoElectronicoContacto");
		
		/*spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(46704314);

		countries.put(spain.getName(), spain);*/		
		payments.put("test", payment);
	}

	public Payment findPayment(String name) {
		System.err.print(name);
		Assert.notNull(name, "The Payment's name must not be null");
		return payments.get(name);
	}
}
