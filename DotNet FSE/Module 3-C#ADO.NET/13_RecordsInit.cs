using System;

public record Employee
{
    public string Name { get; init; }
    public int Age { get; init; }
}

class Program
{
    static void Main()
    {
        var emp1 = new Employee { Name = "John", Age = 30 };
        var emp2 = emp1 with { Age = 31 };

        Console.WriteLine(emp1);
        Console.WriteLine(emp2);
    }
}
