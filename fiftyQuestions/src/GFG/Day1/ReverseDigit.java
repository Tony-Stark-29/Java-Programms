package GFG.Day1;

public class ReverseDigit
{

        public static int Reverse(int num)
        {
            int rev=0;
            while(num!=0)
            {
                rev=(rev*10)+(num%10);
                num/=10;
            }
            return rev;
        }


        public static void main(String[] args)
        {

            System.out.println(Reverse(123));
            System.out.println(Reverse(456));

        }


}
