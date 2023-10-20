public class car extends vehicle
{
    int wheels=4;
    int doors=4;
    @Override
    void go()
    {
        System.out.println("Driving the vehicle");
    }

    void stop()
    {
        System.out.println("Vehicle are stoped");
    }
}
