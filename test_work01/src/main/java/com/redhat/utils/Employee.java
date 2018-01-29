package com.redhat.utils;

import java.util.Date;

public class Employee implements Comparable<Employee>{


    private String surname;
    private String name;
    private Date birthDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
        public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Employee o) {
        return o.getName().compareTo(this.name);
    }
}
