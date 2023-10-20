
public class Main {
    public static void main(String[] args)
    {
        //  toStrin()
        //Car car1 = new Car();
        //car1.drive();
        //car1.brake();

        //System.out.println(car1);



        /* Array of Objects
        Food[] ref=new Food[3];
        Food food1=new Food("Fries");
        Food food2=new Food("Burger");
        Food food3=new Food("Chicken Nuggets");

        ref[0]=food1;
        ref[1]=food2;
        ref[2]=food3;

        System.out.println(ref[0].name);
        System.out.println(ref[1].name);
        System.out.println(ref[2].name);*/

        Car car=new Car("BMW");
        Garage garage1=new Garage();

        garage1.park(car);


    }
}