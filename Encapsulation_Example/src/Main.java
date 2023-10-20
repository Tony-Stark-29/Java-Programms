public class Main {
    public static void main(String[] args)
    {
        Car car1=new Car("Ford","Mustang-GT",2019);

        //Car car2=new Car("Lamborgini","Aventadoor",2020);

        //car2.copy(car1);

        Car car2=new Car(car1);
        System.out.println("Car 1");
        System.out.println(car1);
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());


        System.out.println("\nCar 2");
        System.out.println(car2);
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());



    }
}