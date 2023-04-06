package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.PaypalPayment;

public interface PaypalPaymentRepository extends JpaRepository<PaypalPayment, Integer>{ 

}
