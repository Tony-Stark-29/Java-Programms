import java.util.Objects;

public class ObjDemo
{
    String name;
    int age;

    ObjDemo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjDemo objDemo = (ObjDemo) o;
        return age == objDemo.age && Objects.equals(name, objDemo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args)
    {
        ObjDemo obj1=new ObjDemo("John",28);
        ObjDemo obj2=new ObjDemo("John",28);

        if(obj1.equals(obj2))
        {

            System.out.println("Both values are same");

        }

        System.out.println(obj2.getClass());
    }
}
