package com.hms.model;

import javax.persistence.*;

@Entity
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientName;
    private double amount;
    private String status; // Paid / Unpaid

    // Getters and Setters
}
