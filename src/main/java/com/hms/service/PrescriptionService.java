package com.hms.service;

import com.hms.model.Prescription;

import javax.persistence.*;
import java.util.List;

public class PrescriptionService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hms_pu");

    public void issue(Prescription p) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
    }

    public List<Prescription> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM Prescription", Prescription.class).getResultList();
    }
}
