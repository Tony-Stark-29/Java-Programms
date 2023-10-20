package Spring_Basic;

public class Jio implements Sim
{
    @Override
    public void call()
    {
        System.out.println("Calling using Jio Network");
    }

    @Override
    public void data()
    {
        System.out.println("Internet provider is Jio");
    }
}
