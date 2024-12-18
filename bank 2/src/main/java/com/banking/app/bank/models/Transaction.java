package com.banking.app.bank.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    private String counterparty;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
