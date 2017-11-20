package com.redhat;

public interface MyInterface
{


    default String reverseS(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }

}
