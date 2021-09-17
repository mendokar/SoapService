package com.gdr.repository;

import com.gdr.entity.PaymentDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface IPaymentRepository<T, Id extends Serializable> extends JpaRepository<PaymentDao, String> {

    @Query(value = "{call sp_getPayment(:respuestaCodigo)}",nativeQuery = true)
    PaymentDao findByRespuestaCodigo(@Param("respuestaCodigo") String respuestaCodigo);
}
