package com.gdr.endpoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gdr.PaymentService;
import com.gdr.gs_ws.GetPaymentRequest;
import com.gdr.gs_ws.GetPaymentResponse;
import com.gdr.gs_ws.Payment;
import com.gdr.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	@Autowired
	PaymentService paymentService;

	@Autowired
	ObjectMapper objectMapper;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPaymentRequest")
	@ResponsePayload
	public GetPaymentResponse getPayment(@RequestPayload GetPaymentRequest request) throws Exception {
		GetPaymentResponse response = new GetPaymentResponse();
    Payment payment =
        objectMapper.convertValue(
            paymentService.getPayment(request.getRefPago()), Payment.class);
		response.setPayment(payment);
		return response;
	}
}
