package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Func(0,0,0));
    }

    private static double Func(double a, double b, double c)
    {
        if (a <= 0)
        {
            throw new ArithmeticException("'a' parameter makes the fraction zero-divided");
        }

        double sqrt = b * b + 4 * a * c;
        if (sqrt < 0)
        {
            throw new ArithmeticException("Sqrt component is less than zero");
        }

        double fraction = (b + sqrt) / (2 * a);
        return fraction - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
