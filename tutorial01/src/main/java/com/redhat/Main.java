package com.redhat;

public class Main implements MyInterface
{
    public static void main(String[] args)
    {
        Main test = new Main();
        System.out.println(test.reverseS("johA etevS"));
    }

    public void sayHello()
    {
        System.out.println("Ahoj Svete");
    }
}
