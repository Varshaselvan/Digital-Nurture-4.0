using System;

abstract class Vehicle { public abstract void Drive(); }

interface IDrivable { void Start(); }

class Car : Vehicle, IDrivable
{
    public override void Drive() => Console.WriteLine("Car is driving");
    public void Start() => Console.WriteLine("Car started");
}

class Program
{
    static void Main()
    {
        Car car = new Car();
        car.Start();
        car.Drive();
    }
}
