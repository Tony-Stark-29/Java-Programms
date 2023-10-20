package AtTheCrossRoads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MetroCard
{

    public static void main(String args[])
    {
        MetroCard mc=new MetroCard();
        System.out.println(Arrays.toString(mc.solution(28)));
    }

    int[] solution(int lastNumberOfDays)
    {

        ArrayList<Integer> days=new ArrayList<>();

        days.add(28);
        days.add(30);
        days.add(31);

        int index=lastNumberOfDays==28?1:lastNumberOfDays==30?2:lastNumberOfDays==31?0:3;
        int[] arr=new int[lastNumberOfDays==28?2:lastNumberOfDays==30?1:lastNumberOfDays==31?3:0];
        for(int i=0;i<=arr.length;i++)
        {
            if(index!=days.size())
                arr[i]=days.get(index++);
        }

        return arr;
    }

}
