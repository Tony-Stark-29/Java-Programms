package GFG.Day2;
import  GFG.Day2.LCM;
public class AdditionFraction
{
    public static void Addition(int num1,int den1,int num2,int den2)
    {
         int lcm=(den1==den2)?den1:LCM.LCM(den1,den2);

         if(den1==den2)
         {

             System.out.println((num1+num2)+"/"+(lcm));
             return ;
         }
         else
         {
             System.out.println((num1*lcm)+(num2*lcm)+"/"+(lcm));
         }



    }

    public static void main(String[] args) {
        Addition(1,500,2,500);
    }
}

