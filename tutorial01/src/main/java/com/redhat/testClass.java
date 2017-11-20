package com.redhat;

public class testClass extends Main {
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }

    public static void main(String[] args){
    testClass test = new testClass();
    test.sayHello();
    }

}
