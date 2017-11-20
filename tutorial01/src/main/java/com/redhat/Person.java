package com.redhat;



public class Person {

    String firstName;
    String secondName;
    int age;
    private Address address;


    public Person(String firstName, String secondName, int age)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString()
    {
        return "First name: "+firstName+". Lastname: "+secondName;
    }


}
