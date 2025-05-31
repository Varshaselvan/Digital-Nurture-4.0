using System;

class MyClass { public int Value = 5; }

class Program
{
    static void ChangeValue(int x) => x = 100;
    static void ChangeReference(MyClass obj) => obj.Value = 100;

    static void Main()
    {
        int val = 5;
        MyClass refObj = new MyClass();

        Console.WriteLine($"Before: val={{val}}, refObj.Value={{refObj.Value}}");
        ChangeValue(val);
        ChangeReference(refObj);
        Console.WriteLine($"After: val={{val}}, refObj.Value={{refObj.Value}}");
    }
}
