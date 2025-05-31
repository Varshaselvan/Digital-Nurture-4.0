using System;

class Program
{
    static void RefMethod(ref int x) => x += 10;
    static void OutMethod(out int x) { x = 100; }
    static void InMethod(in int x) => Console.WriteLine($"in: {x}");

    static void Main()
    {
        int a = 5;
        int b;
        int c = 10;

        Console.WriteLine($"Before ref: {a}");
        RefMethod(ref a);
        Console.WriteLine($"After ref: {a}");

        OutMethod(out b);
        Console.WriteLine($"Out: {b}");

        InMethod(c);
    }
}
