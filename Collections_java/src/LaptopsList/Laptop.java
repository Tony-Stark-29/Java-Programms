package LaptopsList;

public class Laptop
{
    String brand, model;
    int ram;
    float price;


    @Override
    public String toString() {
        return ""+this.brand+"-"+this.model+"-"+this.ram+"-"+this.price;
    }

    public Laptop(String brand, String model, int ram, float price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }
}
