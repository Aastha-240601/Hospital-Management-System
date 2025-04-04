package com.hms.controller;

import com.hms.model.Appointment;
import com.hms.service.AppointmentService;

import java.time.LocalDate;
import java.util.Scanner;

public class AppointmentController {
    private AppointmentService service = new AppointmentService();
    private Scanner sc = new Scanner(System.in);

    public void bookAppointment() {
        Appointment a = new Appointment();
        System.out.print("Enter Patient Name: ");
        a.setPatientName(sc.nextLine());
        System.out.print("Enter Doctor Name: ");
        a.setDoctorName(sc.nextLine());
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        a.setDate(LocalDate.parse(sc.nextLine()));

        service.book(a);
        System.out.println("Appointment booked.");
    }

    public void viewAppointments() {
        for (Appointment a : service.getAll()) {
            System.out.println(a.getId() + ": " + a.getPatientName() + " with Dr. " + a.getDoctorName() + " on " + a.getDate());
        }
    }
}
