public class Outter
{
    static class inner
    {
          int a;
        inner(int a)
        {
            a=1;
        }
        public void print()
        {
            System.out.println("A = "+a);
        }
    }

    public void print_inner(int val)
    {
        inner a=new inner(val);
        a.print();
    }
    public static void main(String[] args) {
        inner a=new inner(5);
        a.print();

        Outter b=new Outter();
        b.print_inner(6);
    }
}
