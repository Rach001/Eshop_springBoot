package tn.rach.proj.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data@AllArgsConstructor@NoArgsConstructor

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typePayment", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Payment")
public class Payment implements Serializable{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPayment;
    private float amount;
    private LocalDateTime paymentDate;
    
    @OneToOne
    private Command command;

    public void setPaypalPayment(PaypalPayment paypalPayment) {
        
    }

    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
    }
}
