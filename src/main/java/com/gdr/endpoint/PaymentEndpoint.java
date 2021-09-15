package com.gdr.endpoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gdr.dao.PaymentDao;
import com.gdr.gs_ws.Payment;
import com.gdr.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gdr.gs_ws.GetPaymentRequest;
import com.gdr.gs_ws.GetPaymentResponse;
import com.gdr.repository.PaymentRepository;

import java.util.Optional;

@Endpoint
public class PaymentEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private IPaymentRepository paymentRepository;

	private ObjectMapper objectMapper;
	@Autowired
	public PaymentEndpoint(PaymentRepository paymentRepository) {
		paymentRepository = paymentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaymentRequest")
	@ResponsePayload
	public GetPaymentResponse getPayment(@RequestPayload GetPaymentRequest request) {		
		GetPaymentResponse response = new GetPaymentResponse();
		PaymentDao paymentDao = paymentRepository.findPayment(request.getRefPago());
		response.setPayment(objectMapper.convertValue(paymentDao, Payment.class));
		return response;
	}
}
