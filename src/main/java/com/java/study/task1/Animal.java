package com.java.study.task1;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "tale")
    private boolean tale;

    public Animal() {
    }

    public Animal(String name, int age, boolean tale) {
        this.name = name;
        this.age = age;
        this.tale = tale;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tale=" + tale +
                '}';
    }
}
