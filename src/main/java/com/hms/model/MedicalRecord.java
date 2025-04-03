package com.hms.model;

import javax.persistence.*;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientName;
    private String diagnosis;
    private String treatment;

    // Getters and Setters
}
