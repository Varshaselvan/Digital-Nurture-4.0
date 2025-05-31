using System;
using System.Web;

class Program
{
    static void Main()
    {
        Console.Write("Enter input: ");
        string input = Console.ReadLine();
        string sanitized = HttpUtility.HtmlEncode(input);
        Console.WriteLine($"Sanitized input: {sanitized}");
    }
}
