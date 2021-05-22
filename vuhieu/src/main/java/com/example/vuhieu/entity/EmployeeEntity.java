package com.example.vuhieu.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
    @Id@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column(name= "name")
    private String name;

    @Column(name = "wage")
    private int wage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
