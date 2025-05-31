using System;

class Program
{
    static int CalculateFactorial(int number)
    {
        int Factorial(int n) => n <= 1 ? 1 : n * Factorial(n - 1);
        return Factorial(number);
    }

    static void Main()
    {
        Console.WriteLine(CalculateFactorial(5));
    }
}
