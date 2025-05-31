using System;

class Program
{
    static (int, string) GetData() => (1, "Data");

    static void Main()
    {
        var (id, name) = GetData();
        Console.WriteLine($"{id}, {name}");
    }
}
