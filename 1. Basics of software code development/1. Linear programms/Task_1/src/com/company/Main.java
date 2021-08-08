package com.company;

public class Main
{

    public static void main(String[] args)
    {
        if (GetZ(0, 0, 0) != 0)
            throw new AssertionError("Method is wrong");

        if (GetZ(0, 128, 255) != 63)
            throw new AssertionError("Method is wrong");

        if (GetZ(-1, 6, -10) != -22)
            throw new AssertionError("Method is wrong");
    }

    private static double GetZ(double a, double b, double c)
    {
        return ((a - 3) * b / 2) + c;
    }
}