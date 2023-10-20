public class Car {
    String make = "Ford";
    String model = "Mustang - GT";
    int year = 2022;
    String color = "Metal Gery";
    double price = 5000000.00;

    Car(String make)
    {
        this.make=make;
    }
    void drive()
    {
        System.out.println("You are Driving the Car");
    }

    void brake()
    {
        System.out.println("You are Stopping the Car");
    }

    public String toString()
    {
        String mystr=make+"\n"+model+"\n"+year+"\n"+color+"\n"+price;
        return mystr;
    }


}
