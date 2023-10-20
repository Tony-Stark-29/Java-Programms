import java.awt.*;

public class Main {
    public static void main(String[] args)
    {


        car car1=new car();
        car1.go();
        System.out.println(car1.doors);

        bicycle bi1=new bicycle();
        bi1.go();
        System.out.println(bi1.pedals);

    }
}