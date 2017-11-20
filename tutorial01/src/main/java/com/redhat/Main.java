package com.redhat;

public class Main implements MyInterface
{
    public static void main(String[] args)
    {
        Main test = new Main();
        Person john = new Person("John","Snow",35);
        System.out.println(john.toString());

        john.setFirstName("Aegon");
        john.setSecondName("Targaryen");
        System.out.println(john.toString());

        Address address = new Address("Kounicova","55","Brno");
        john.setAddress(address);

        john.getAddress().setNumber("18");

        System.out.println(john.getAddress().toString());


    }

    public void sayHello()
    {
        System.out.println("Ahoj Svete");
    }

}
