import java.util.Arrays;

public class Arr1 {
    void makeArr(int[] arr) {
        int len = arr.length;
        int[] output = new int[3];

        System.out.println(countPositive(arr)/arr.length);
        System.out.println( countNeutral(arr)/arr.length);
        System.out.println( countNegative(arr)/arr.length);

    }

    int countPositive(int[] arr) {

        int len=0, count = 0;

        for(int i=0;i<arr.length;i++){
            if (arr[len++] > 0)
                count++;
        }

        return count;

    }

    int countNegative(int[] arr)
    {
        int len=0, count = 0;

        while (len != arr.length - 1) {
            if (arr[len++] < 0)
                count++;
        }
        return count;
    }

    int countNeutral(int[]  arr)
    {

        int len=0, count = 0;

            while(len!=arr.length-1)
            {
                if(arr[len++]==0)
                    count++;
            }
             return count;
    }
    public static void main(String[] args)
    {

        int[] arr={1,2,4,-8,-1,0};
    Arr1 a=new Arr1();
    a.makeArr(arr);

    }
}
