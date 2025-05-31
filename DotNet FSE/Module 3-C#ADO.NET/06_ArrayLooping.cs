class Program
{
    static void Main()
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.Length; i++) Console.WriteLine($"for: {arr[i]}");
        foreach (var item in arr) Console.WriteLine($"foreach: {item}");

        int j = 0;
        while (j < arr.Length) Console.WriteLine($"while: {arr[j++]}");

        int k = 0;
        do { Console.WriteLine($"do-while: {arr[k++]}"); } while (k < arr.Length);
    }
}
