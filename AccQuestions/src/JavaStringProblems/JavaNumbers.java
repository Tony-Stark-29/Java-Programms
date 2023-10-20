package JavaStringProblems;

public class JavaNumbers
{
    public static int[] swap(int num1,int num2)
    {
        return new int[]{num2,num1};
    }
    public static void main(String[] args)
    {

        int num1=21;
        int num2=31;

        int[] arr=swap(num1,num2);
        num1=arr[0];
        num2=arr[1];

        System.out.println(num1+" "+num2);

    }
}
