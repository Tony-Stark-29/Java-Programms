package package2;
import package1.*;
public class Asub extends A
{
    public static void main(String[] args)
    {
        Asub a=new Asub();
        System.out.println(a.protectedMessage);
    }
}
