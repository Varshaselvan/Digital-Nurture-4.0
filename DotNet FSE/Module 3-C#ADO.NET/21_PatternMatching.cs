using System;

class Program
{
    static void Describe(object obj)
    {
        switch (obj)
        {
            case int i:
                Console.WriteLine($"Integer: {i}");
                break;
            case string s:
                Console.WriteLine($"String: {s}");
                break;
            default:
                Console.WriteLine("Unknown type");
                break;
        }
    }

    static void Main()
    {
        Describe(5);
        Describe("Hello");
    }
}
