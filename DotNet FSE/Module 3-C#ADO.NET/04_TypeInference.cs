class Custom { public int Id = 1; }

class Program
{
    static void Main()
    {
        var number = 10;
        var text = "Hello";
        Custom obj = new();

        Console.WriteLine($"{number.GetType()} {number}");
        Console.WriteLine($"{text.GetType()} {text}");
        Console.WriteLine($"{obj.GetType()} {obj.Id}");
    }
}
