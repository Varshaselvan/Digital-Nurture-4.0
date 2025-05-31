using System;

class Product
{
    public string Name { get; set; }
    private double price;

    public double Price
    {
        get => price;
        set => price = value < 0 ? 0 : value;
    }

    public void Display() => Console.WriteLine($"{Name}, {Price}");
}

class Program
{
    static void Main()
    {
        Product p = new Product { Name = "Phone", Price = -100 };
        p.Display();
    }
}
