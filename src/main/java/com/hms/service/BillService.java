package com.hms.service;

import com.hms.model.Bill;

import javax.persistence.*;
import java.util.List;

public class BillService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("hms_pu");

    public void generate(Bill b) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(b);
        em.getTransaction().commit();
        em.close();
    }

    public List<Bill> getAll() {
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM Bill", Bill.class).getResultList();
    }
}
