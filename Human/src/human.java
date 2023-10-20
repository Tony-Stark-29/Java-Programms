import java.sql.SQLOutput;

public class human
{
    String name;
    int age;
    double weight;
    human(String name,int age,double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    void print_details()
    {
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("WEIGHT : "+weight);
    }

    void eat()
    {
        System.out.println(this.name+" is eating");
    }
}
