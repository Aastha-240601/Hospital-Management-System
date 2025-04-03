package com.hms.controller;

import com.hms.model.Patient;
import com.hms.service.PatientService;

import java.util.Scanner;

public class PatientController {
    private PatientService service = new PatientService();
    private Scanner sc = new Scanner(System.in);

    public void addPatient() {
        Patient p = new Patient();
        System.out.print("Enter Name: ");
        p.setName(sc.nextLine());
        System.out.print("Enter Age: ");
        p.setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Gender: ");
        p.setGender(sc.nextLine());
        System.out.print("Enter Contact: ");
        p.setContact(sc.nextLine());

        service.registerPatient(p);
        System.out.println("Patient registered successfully.");
    }

    public void viewAllPatients() {
        for (Patient p : service.getAllPatients()) {
            System.out.println(p.getId() + " - " + p.getName() + ", " + p.getAge() + ", " + p.getGender());
        }
    }
}
