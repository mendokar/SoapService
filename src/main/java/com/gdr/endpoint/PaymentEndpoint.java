package com.gdr.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.gdr.gs_ws.GetPaymentRequest;
import com.gdr.gs_ws.GetPaymentResponse;
import com.gdr.repository.PaymentRepository;

@Endpoint
public class PaymentEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private PaymentRepository paymentRepository;

	@Autowired
	public PaymentEndpoint(PaymentRepository paymentRepository) {
		this.paymentRepository = paymentRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaymentRequest")
	@ResponsePayload
	public GetPaymentResponse getPayment(@RequestPayload GetPaymentRequest request) {		
		GetPaymentResponse response = new GetPaymentResponse();
		response.setPayment(paymentRepository.findPayment(request.getRefPago()));

		return response;
	}
}
