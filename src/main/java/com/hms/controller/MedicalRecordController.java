package com.hms.controller;

import com.hms.model.MedicalRecord;
import com.hms.service.MedicalRecordService;

import java.util.Scanner;

public class MedicalRecordController {
    private MedicalRecordService service = new MedicalRecordService();
    private Scanner sc = new Scanner(System.in);

    public void addRecord() {
        MedicalRecord r = new MedicalRecord();
        System.out.print("Enter Patient Name: ");
        r.setPatientName(sc.nextLine());
        System.out.print("Enter Diagnosis: ");
        r.setDiagnosis(sc.nextLine());
        System.out.print("Enter Treatment: ");
        r.setTreatment(sc.nextLine());

        service.addRecord(r);
        System.out.println("Medical record added.");
    }

    public void viewRecords() {
        for (MedicalRecord r : service.getAll()) {
            System.out.println(r.getId() + ": " + r.getPatientName() + " - " + r.getDiagnosis() + " / " + r.getTreatment());
        }
    }
}
