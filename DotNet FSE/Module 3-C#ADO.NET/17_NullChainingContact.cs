using System;

class Contact
{
    public string? Name { get; set; }
    public string? PhoneNumber { get; set; }
}

class Program
{
    static void Main()
    {
        Contact contact = null;
        Console.WriteLine(contact?.Name ?? "No contact info");
    }
}
