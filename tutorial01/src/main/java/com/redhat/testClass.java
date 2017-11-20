package com.redhat;

public class testClass extends Main
{
    String jmeno;
    String prijimeni;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijimeni() {
        return prijimeni;
    }

    public void setPrijimeni(String prijimeni) {
        this.prijimeni = prijimeni;
    }

    @Override
    public void sayHello()
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args)
    {
        testClass test = new testClass();
        test.sayHello();
    }

}
