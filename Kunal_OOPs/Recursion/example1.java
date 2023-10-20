public class example1
{
    static void message(int n)
    {
        System.out.println("Hello World !");
        if(n>0)
        {
            message(n--);
        }
    }
    public static void main(String[] args)
    {
        message(5);
    }
}
