public class problem_10
{
    public static int secondLargset1(int[] arr) {

        int lar1 = arr[0] > arr[1] ? arr[0] : arr[1];
        int lar2 = arr[0] < arr[1] ? arr[0] : arr[1];


        for (int i = 2; i < arr.length; i++)
        {
            if(arr[i]>lar1)
            {
                lar2=lar1;
                lar1=arr[i];
            }
            else if(arr[i]<lar1 && arr[i]>lar2)
            {
                lar2=arr[i];
            }
        }

        return lar2;
    }

    public static void main(String[] args)
    {

        System.out.println(secondLargset1(new int[] {45, 51, 28, 75, 49, 42}));
        System.out.println(secondLargset1(new int[] {985, 521, 975, 831, 479, 861}));
        System.out.println(secondLargset1(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));

    }
}
