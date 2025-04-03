package com.hms.dao;

import com.hms.model.Patient;

import javax.persistence.*;
import java.util.List;

public class PatientDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hms_pu");

    public void save(Patient patient) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(patient);
        em.getTransaction().commit();
        em.close();
    }

    public List<Patient> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM Patient", Patient.class).getResultList();
    }
}
