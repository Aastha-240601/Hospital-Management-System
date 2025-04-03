package com.hms;

import com.hms.controller.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientController pc = new PatientController();
        AppointmentController ac = new AppointmentController();
        MedicalRecordController mc = new MedicalRecordController();
        PrescriptionController prc = new PrescriptionController();
        BillController bc = new BillController();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nHOSPITAL MANAGEMENT SYSTEM (CLI)");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Add Medical Record");
            System.out.println("6. View Medical Records");
            System.out.println("7. Issue Prescription");
            System.out.println("8. View Prescriptions");
            System.out.println("9. Generate Bill");
            System.out.println("10. View Bills");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> pc.addPatient();
                case 2 -> pc.viewAllPatients();
                case 3 -> ac.bookAppointment();
                case 4 -> ac.viewAppointments();
                case 5 -> mc.addRecord();
                case 6 -> mc.viewRecords();
                case 7 -> prc.issuePrescription();
                case 8 -> prc.viewPrescriptions();
                case 9 -> bc.generateBill();
                case 10 -> bc.viewBills();
                case 0 -> exit = true;
                default -> System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
