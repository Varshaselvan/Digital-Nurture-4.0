using System;
using System.IO;
using System.Text.Json;

class User
{
    public string Name { get; set; }
    public int Age { get; set; }
    public string Email { get; set; }
}

class Program
{
    static void Main()
    {
        var user = new User { Name = "Alice", Age = 25, Email = "alice@example.com" };
        string json = JsonSerializer.Serialize(user);
        File.WriteAllText("user.json", json);

        string readJson = File.ReadAllText("user.json");
        var deserialized = JsonSerializer.Deserialize<User>(readJson);
        Console.WriteLine($"{deserialized.Name}, {deserialized.Age}, {deserialized.Email}");
    }
}
