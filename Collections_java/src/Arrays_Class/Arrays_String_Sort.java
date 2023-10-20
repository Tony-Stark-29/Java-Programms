package Arrays_Class;

import java.util.Arrays;

public class Arrays_String_Sort
{
    public static void main(String[] args)
    {

        String[] strArr={"Zebra","H","Ant","a","Pegion"};

        StrComp comp=new StrComp();

        Arrays.sort(strArr,comp);

        System.out.println(Arrays.toString(strArr));

    }
}
