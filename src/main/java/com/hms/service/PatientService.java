package com.hms.service;

import com.hms.dao.PatientDAO;
import com.hms.model.Patient;

import java.util.List;

public class PatientService {
    private PatientDAO dao = new PatientDAO();

    public void registerPatient(Patient patient) {
        dao.save(patient);
    }

    public List<Patient> getAllPatients() {
        return dao.getAll();
    }
}
