import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation
{
    int arr[]={1,2,3,4,5};
    int size=(arr.length)-1;

    void rotateArray()
    {
        int lastElm=arr[size];
        for (int i=size;i>=1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=lastElm;

    }

    public static void main(String[] args)
    {

        int rCount=0;
        ArrayRotation ar=new ArrayRotation();

        Scanner scan=new Scanner(System.in);
        System.out.println("Rotation Count : ");
        rCount=scan.nextInt();

        for(int i=1;i<=rCount;i++)
        {
            ar.rotateArray();
            System.out.println(Arrays.toString(ar.arr));
        }



    }
}
