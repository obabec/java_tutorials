package com.redhat;

public class SimpleMath {

    public static double multiply(double x, double y)
    {
        if (x>999)
        {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }

}
