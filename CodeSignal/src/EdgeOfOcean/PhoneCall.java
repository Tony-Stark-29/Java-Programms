package EdgeOfOcean;

public class PhoneCall
{
    public static void main(String args[])
    {
        int min1=1,min2_10=2,min11=1,s=6;

        int minute=0;

        minute=s-min1 >=0?1:0;
        s-=min1*1;

        minute+= s/min2_10 >=9? 9:s/min2_10;
        s-=min2_10 *(minute-1);

        minute+=minute>10?Math.ceil(s/min11):0;

        System.out.println(s+" "+minute);


    }
}
