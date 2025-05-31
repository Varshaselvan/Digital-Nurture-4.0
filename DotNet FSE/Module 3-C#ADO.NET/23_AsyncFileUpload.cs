using System;
using System.Threading.Tasks;

class Program
{
    static async Task<string> UploadFileAsync()
    {
        await Task.Delay(3000);
        return "Upload successful";
    }

    static async Task Main()
    {
        try
        {
            string result = await UploadFileAsync();
            Console.WriteLine(result);
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Error: {ex.Message}");
        }
    }
}
