public class Main {
    public static void main(String[] args)
    {
       Car myCar1=new Car("BMW");
       Car myCar2=new Car("Bugatti");
       Car myCar3=new Car("Ferrai");
       Garage myGarage=new Garage();

       myGarage.park(myCar1);
       myGarage.park(myCar2);
       myGarage.park(myCar3);
    }
}