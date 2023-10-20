package GFG.Day1;

public class AmstrongNumber
{
    public static boolean Amstrong(int num)
    {
        int len=Integer.toString(num).length();
        int numC=num;
        int sum=0;
        while(num!=0)
        {

            sum+= Math.pow((num%10),len);
            num/=10;
        }
        return numC==sum?true:false;
    }
    public static void main(String[] args)
    {

        System.out.println(Amstrong(153));

    }
}
