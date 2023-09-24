package com.estudos.springestudos.app;

import com.estudos.springestudos.dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Aplicacao {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null,"Carlos da silva","carlos@gmail.com");
        Pessoa p2 = new Pessoa(null,"Joaquin Torres","joaquim@gmail.com");
        Pessoa p3 = new Pessoa(null,"Ana Maria","ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        System.out.println("Pronto");

    }
}
