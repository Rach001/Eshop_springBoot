package tn.rach.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.rach.proj.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
