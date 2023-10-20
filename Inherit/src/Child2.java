public class Child2 extends Parent
{
    public String pbl;
    protected String prt;
    String dft;

    private String pvt;


    Child2()
    {
        this.pbl="Child 2 Public Variable";
        this.prt="Child 2 Protected Variable";
        this.dft="Child 2 Default Variable";
        this.pbl="Child 2 Private Variable";
    }

    public void publicChild()
    {
        System.out.println("Calling Child 2 Public method");
    }
    protected void protectedChild()
    {
        System.out.println("Calling Child 2 Protected method");
    }
    void defaultChild()
    {
        System.out.println("Calling Child 2 Default method");
    }

    private void privateChild()
    {
        System.out.println("Calling Child 2 Public method");
    }
    @Override
    protected void protectedInfo()
    {
        System.out.println("Child 2 Protected Info");
    }

    @Override
    void defaultInfo()
    {
        System.out.println("Child 2 default Info");
    }

    @Override
    void publicInfo()
    {
        System.out.println("Child 2 Public Info");
    }
}
