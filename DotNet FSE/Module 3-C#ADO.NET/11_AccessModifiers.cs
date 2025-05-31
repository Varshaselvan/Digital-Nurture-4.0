using System;

class BaseClass
{
    public string PublicField = "Public";
    private string PrivateField = "Private";
    protected string ProtectedField = "Protected";

    public void Show() => Console.WriteLine($"{PublicField}, {PrivateField}, {ProtectedField}");
}

class DerivedClass : BaseClass
{
    public void Display()
    {
        Console.WriteLine(PublicField);
        Console.WriteLine(ProtectedField);
    }
}

class NonDerived
{
    public void Display()
    {
        BaseClass b = new BaseClass();
        Console.WriteLine(b.PublicField);
    }
}
