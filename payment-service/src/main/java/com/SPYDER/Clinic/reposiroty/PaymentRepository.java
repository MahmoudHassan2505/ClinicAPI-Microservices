package com.SPYDER.Clinic.reposiroty;

import com.SPYDER.Clinic.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,String> {

    List<Payment> findAllByPatientId(long id);
}
