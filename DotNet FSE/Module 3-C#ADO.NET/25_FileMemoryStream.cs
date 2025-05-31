using System;
using System.IO;

class Program
{
    static void Main()
    {
        using var fs = new FileStream("example.txt", FileMode.OpenOrCreate);
        using var writer = new StreamWriter(fs);
        writer.WriteLine("Hello, FileStream!");
        writer.Flush();

        byte[] buffer = new byte[100];
        using var ms = new MemoryStream(buffer);
        ms.WriteByte(0x41);
        Console.WriteLine($"Bytes written: {ms.Position}");
    }
}
