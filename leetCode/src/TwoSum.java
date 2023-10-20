import java.util.*;

public class TwoSum
{
    public static void main(String args[])
    {

            int arr[]={3,3};
            int target=6;
            List<Integer> index=new ArrayList<>();


            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(i!=j)
                    {
                        if(arr[i]+arr[j]==target)
                        {
                             index.add(i);
                             index.add(j);
                        }
                    }
                }
            }

        Collections.sort(index);
            List<Integer> newIndex=new ArrayList<>();
            for(int i:index)
            {
                if(!newIndex.contains(i))
                {
                    newIndex.add(i);
                }
            }
        System.out.println(newIndex);
            newIndex.toArray();


    }
}
