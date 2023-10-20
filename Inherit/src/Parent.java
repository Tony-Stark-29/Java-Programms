public class Parent
{
    public String pbl ;
    protected String prt ;
    String dft ;

    private String pvt ;

    Parent()
    {
        this.pbl="Parent Public Variable";
        this.prt="Parent Protected Variable";
        this.dft="Parent Default Variable";
        this.pbl="Parent Private Variable";
    }

    public void publicParent()
    {
        System.out.println("Calling Parent's Public method");
    }
    protected void protectedParent()
    {
        System.out.println("Calling Parent's Protected method");
    }
    void defaultParent()
    {
        System.out.println("Calling Parent's Default method");
    }

    private void privateParent()
    {
        System.out.println("Calling Parent's Public method");
    }


    protected void protectedInfo()
    {
        System.out.println("Parent Protected Info");
    }
     void defaultInfo()
    {
        System.out.println("Parent default Info");
    }
     void publicInfo()
    {
     System.out.println("Parent Public Info");
    }


}
