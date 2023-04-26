package com.java.study.task1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Casper", 4, true);

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
             Session session = factory.openSession()){

            session.beginTransaction();
            session.persist(animal);
            session.getTransaction().commit();

        } catch (RuntimeException e){
            throw new RuntimeException(e);
        }
    }
}
