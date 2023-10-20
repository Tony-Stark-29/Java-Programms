package GFG.Day1;

import java.awt.image.Kernel;

public class PrintKthDigit
{
    public static int kthDigit(int num,int pw,int index)
    {
       int pow=1;
       while(pw!=0)
       {
           pow*=num;
           pw--;
           System.out.println(pow);
       }

       return pow%10;
    }

    public static void main(String[] args) {
        System.out.println( kthDigit(5,2,2));
    }
}
