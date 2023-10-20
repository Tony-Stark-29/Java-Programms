import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RomanT0Numbera
{
    public static void main(String args[])
    {
        HashMap<String,Integer> values=new HashMap<>();
        values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);



        String roman="MCMXCIV";
        int num=0;
        for(int i=0;i<roman.length();i++)
        {
            if(values.get(roman.charAt(i))<values.get(roman.charAt(i+1)))
            {
                num+= (values.get(roman.charAt(i+1))-values.get(roman.charAt(i)));
                i++;
            }
            else {
                num += values.get(roman.charAt(i));
            }
            System.out.println(num);
        }
        System.out.println(num);
    }
}
