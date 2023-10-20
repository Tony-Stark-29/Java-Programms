public class Static_initialization
{
    static int a;
    static int b=1;

    static {

        a=b;
        b++;

    }

    public void print()
    {
        System.out.println("a : "+a+"\tb : "+b);
    }
}
