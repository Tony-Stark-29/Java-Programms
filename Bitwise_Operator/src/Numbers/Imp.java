package Numbers;

public class Imp
{
    public static void main(String[] args)
    {

        OddEven o=new OddEven();
        PowerOfTwo pot=new PowerOfTwo();
        CountBits cb=new CountBits();
        NthBit nbit=new NthBit();
        Negative neg=new Negative();


        System.out.println(o.isOdd(23));
        System.out.println(o.isOdd(2));
        System.out.println(o.isEven(2));
        System.out.println(o.isEven(21));

        System.out.println("20 is power of two : "+pot.isPowerOfTwo(20));
        System.out.println("32 is power of two : "+pot.isPowerOfTwo(32));

        System.out.println("2 - "+cb.CountSetBit(2));
        System.out.println("4 - "+cb.CountSetBit(4));
        System.out.println("5 - "+cb.CountSetBit(5));
        System.out.println("5 - "+cb.CountsetBit2(5));
        System.out.println("16 - "+cb.CountSetBit(16));



        System.out.println(" 12 -  :"+Integer.toString(12,2));
        System.out.println(" 12 -  : "+ nbit.getNthBit(12,2));
        System.out.println(" 12 -  : "+ Integer.toString(nbit.changeNthBit(12,2),2));

        System.out.println(neg.isNegative(1));
        System.out.println(neg.isNegative(-1));

        System.out.println(neg.convertToNegative(1));
        System.out.println(neg.convertToNegative(11));






    }
}
