public class Child1 extends Parent
{
    public String pbl ;
    protected String prt ;
    String dft ;

    private String pvt ;

    Child1()
    {
        this.pbl="Child 1 Public Variable";
        this.prt="Child 1 Protected Variable";
        this.dft="Child 1 Default Variable";
        this.pbl="Child 1 Private Variable";
    }


    public void publicChild()
    {
        System.out.println("Calling Child 1 Public method");
    }
    protected void protectedChild()
    {
        System.out.println("Calling Child 1 Protected method");
    }
    void defaultChild()
    {
        System.out.println("Calling Child 1 Default method");
    }

    private void privateChild()
    {
        System.out.println("Calling Child 1 Public method");
    }
    @Override
    protected void protectedInfo()
    {
        System.out.println("Child 1 Protected Info");
    }

    @Override
    void defaultInfo()
    {
        System.out.println("Child 1 default Info");
    }

    @Override
     protected void publicInfo()
    {
        System.out.println("Child 1 Public Info");
    }
}
