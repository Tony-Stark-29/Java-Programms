package EdgeOfOcean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MakeArrayConsecutive2
{
    public static void main(String args[])
    {

        int[] inputArray={6, 2, 3, 8};
        ArrayList<Integer> sorted=new ArrayList<>();
        ArrayList<Integer> elm=new ArrayList<>();

        for (int i=0;i<inputArray.length;i++)
        {
            sorted.add(inputArray[i]);
        }
        Collections.sort(sorted);

        System.out.println(sorted);

         for (int i=sorted.get(0);i<sorted.get(sorted.size()-1);i++)
         {
             if(!sorted.contains(i))
             {
                 elm.add(i);
             }
         }

        System.out.println(elm);
        System.out.println(elm.size());
    }

    int Simple(int[] arr)
    {
        Arrays.sort(arr);
        return arr.length;
    }
}



