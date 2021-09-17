package com.gdr;

import com.gdr.entity.PaymentDao;
import com.gdr.repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    IPaymentRepository paymentRepository;

    public PaymentDao getPayment(String respuestaCodigo){
        return paymentRepository.findByRespuestaCodigo(respuestaCodigo);
    }



}
