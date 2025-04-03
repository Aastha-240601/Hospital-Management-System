package com.hms.controller;

import com.hms.model.Bill;
import com.hms.service.BillService;

import java.util.Scanner;

public class BillController {
    private BillService service = new BillService();
    private Scanner sc = new Scanner(System.in);

    public void generateBill() {
        Bill b = new Bill();
        System.out.print("Enter Patient Name: ");
        b.setPatientName(sc.nextLine());
        System.out.print("Enter Amount: ");
        b.setAmount(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter Status (Paid/Unpaid): ");
        b.setStatus(sc.nextLine());

        service.generate(b);
        System.out.println("Bill generated.");
    }

    public void viewBills() {
        for (Bill b : service.getAll()) {
            System.out.println(b.getId() + ": " + b.getPatientName() + " - $" + b.getAmount() + " [" + b.getStatus() + "]");
        }
    }
}
