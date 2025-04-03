package com.hms.controller;

import com.hms.model.Prescription;
import com.hms.service.PrescriptionService;

import java.util.Scanner;

public class PrescriptionController {
    private PrescriptionService service = new PrescriptionService();
    private Scanner sc = new Scanner(System.in);

    public void issuePrescription() {
        Prescription p = new Prescription();
        System.out.print("Enter Patient Name: ");
        p.setPatientName(sc.nextLine());
        System.out.print("Enter Medication: ");
        p.setMedication(sc.nextLine());
        System.out.print("Enter Dosage: ");
        p.setDosage(sc.nextLine());

        service.issue(p);
        System.out.println("Prescription issued.");
    }

    public void viewPrescriptions() {
        for (Prescription p : service.getAll()) {
            System.out.println(p.getId() + ": " + p.getPatientName() + " - " + p.getMedication() + " / " + p.getDosage());
        }
    }
}
