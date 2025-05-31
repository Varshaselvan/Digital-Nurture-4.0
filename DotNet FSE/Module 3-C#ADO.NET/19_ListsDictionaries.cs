using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        List<string> names = new() { "Alice", "Bob" };
        Dictionary<int, string> dict = new() { {1, "One"}, {2, "Two"} };

        foreach (var name in names) Console.WriteLine(name);
        foreach (var kv in dict) Console.WriteLine($"{kv.Key}: {kv.Value}");

        dict.Remove(1);
        names.Add("Charlie");
    }
}
