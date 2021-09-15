package com.gdr.repository;

import com.gdr.dao.PaymentDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface IPaymentRepository<T, Id extends Serializable> extends CrudRepository<T, Id> {
    PaymentDao findPayment(String name);
}
