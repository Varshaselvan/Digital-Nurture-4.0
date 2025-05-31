public class Student
{
    public required string Name { get; init; }
    public required int Age { get; init; }
}

class Program
{
    static void Main()
    {
        var student = new Student { Name = "Alice", Age = 20 };
        Console.WriteLine($"{student.Name}, {student.Age}");
    }
}
