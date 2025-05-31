using System;

class Program
{
    static int CalculateTotal(int a, int b) => a + b;
    static double CalculateTotal(double a, double b, double c) => a + b + c;

    static void Main()
    {
        Console.WriteLine(CalculateTotal(5, 10));
        Console.WriteLine(CalculateTotal(1.5, 2.5, 3.0));
    }
}
