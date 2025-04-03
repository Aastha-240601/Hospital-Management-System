package com.hms.model;

import javax.persistence.*;

@Entity
@Table(name = "prescriptions")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientName;
    private String medication;
    private String dosage;

    // Getters and Setters
}
