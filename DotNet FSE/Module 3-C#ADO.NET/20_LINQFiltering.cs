using System;
using System.Collections.Generic;
using System.Linq;

class Order
{
    public int OrderId { get; set; }
    public string CustomerName { get; set; }
    public double TotalAmount { get; set; }
}

class Program
{
    static void Main()
    {
        var orders = new List<Order>
        {
            new() { OrderId = 1, CustomerName = "Alice", TotalAmount = 150 },
            new() { OrderId = 2, CustomerName = "Bob", TotalAmount = 50 }
        };

        var result = from o in orders where o.TotalAmount > 100
                     select new { o.OrderId, o.CustomerName };

        foreach (var r in result) Console.WriteLine($"{r.OrderId}, {r.CustomerName}");
    }
}
