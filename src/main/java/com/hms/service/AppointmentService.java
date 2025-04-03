package com.hms.service;

import com.hms.model.Appointment;

import javax.persistence.*;
import java.util.List;

public class AppointmentService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hms_pu");

    public void book(Appointment a) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
    }

    public List<Appointment> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM Appointment", Appointment.class).getResultList();
    }
}
