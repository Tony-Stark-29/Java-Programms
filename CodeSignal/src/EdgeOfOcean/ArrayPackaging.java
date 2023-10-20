package EdgeOfOcean;


import java.util.Arrays;
import java.util.Collections;

public class ArrayPackaging
{

    String ConvertToEightBitBinary(int a)
    {

        String binary="";
        for(int i=1;i<=8;i++)
        {
            binary+=a%2;
            a=a/2;
        }

        return binary;

    }
    int solution(int[] a)
    {
        String BinaryNumber="";
        for(int i=0;i<a.length;i++)
        {
            BinaryNumber+=ConvertToEightBitBinary(a[i]);
        }


        System.out.println(BinaryNumber);
        return convertToDecimal(BinaryNumber);

    }

    int convertToDecimal(String s)
    {
        int D=0,pow=0;

        for(int i=0;i<s.length();i++)
        {
            if(i>0)
            {
                D+=Math.pow(s.charAt(i),pow);
            }

            pow++;

        }
        return D;
    }

    int S(int[] a) {
        int value = 0;
        for (int i=a.length-1; i>=0; i--) {
            System.out.print(value<<8);
            value = (value<<8)+a[i];
            System.out.print(" "+value+"\n");
        }
        return value;
    }


    public static void main(String[] args)
    {

            int arr[]={23,45,39};


            ArrayPackaging ap=new ArrayPackaging();
            System.out.println(ap.S(arr));

    }
}
