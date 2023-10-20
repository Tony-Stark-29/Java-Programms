public class Fish implements Prey,Predator
{

    @Override
    public void hunt()
    {
        System.out.println("Fishing is hunting");
    }

    @Override
    public void flee()
    {
        System.out.println("Fish is fleeing");
    }
}
