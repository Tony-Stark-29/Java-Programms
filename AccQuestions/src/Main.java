import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        int[] arr={23,5,2,51,1,29,5,34};

        System.out.println(sum(arr));

    }


    public static int secondLargest(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static int sum(int[] arr)
    {
        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer> even=new ArrayList<Integer>();

        int index=0;
        for(int elm:arr)
        {
            if(index%2==0)
            {
                even.add(arr[index++]);
            }
            else
            {
                odd.add(arr[index++]);
            }
        }

        System.out.println(odd);
        System.out.println(even);

       Collections.sort(odd);
       Collections.sort(even);

        System.out.println(odd);
        System.out.println(even);

        return odd.get(odd.size()-2) + even.get(even.size()-2);
    }

}