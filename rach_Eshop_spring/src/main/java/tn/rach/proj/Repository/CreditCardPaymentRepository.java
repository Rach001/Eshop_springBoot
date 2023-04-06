package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.CreditCardPayment;

public interface CreditCardPaymentRepository extends JpaRepository<CreditCardPayment, Integer> {
     
}
