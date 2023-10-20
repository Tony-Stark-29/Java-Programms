package GFG.Day1;

public class ClosestNumber
{

    public static int Closest(int num,int div)
    {
        int d1=num - (num%div);
        int d2=(num+div) - (num%div);

        if(num<0)
        {
            return (num-d1) > (d2-num)? d1:d2;
        }

        return (num-d1) > (d2-num)? d2:d1;
    }
    public static void main(String[] args)
    {
        System.out.println(Closest(-15,6));
        System.out.println(Closest(13,4));
        System.out.println(Closest(7,2));
        System.out.println(Closest(8,3));
    }
}
