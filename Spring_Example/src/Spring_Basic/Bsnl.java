package Spring_Basic;

public class Bsnl implements Sim
{
    @Override
    public void call()
    {
        System.out.println("Calling using BSNL Network");
    }

    @Override
    public void data()
    {
        System.out.println("Internet provider is BSNL");
    }
}
