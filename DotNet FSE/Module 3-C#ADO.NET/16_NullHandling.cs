using System;

class Person
{
    public string? Name { get; set; }
    public string? Address { get; set; }
}

class Program
{
    static void Main()
    {
        Person person = null;
        Console.WriteLine(person?.Name ?? "Name not available");
    }
}
