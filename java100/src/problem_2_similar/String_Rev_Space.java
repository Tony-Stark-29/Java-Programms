package problem_2_similar;

public class String_Rev_Space
{

    public static String reverse(String str)
    {
        char[] arr=str.toCharArray();
        String rev="";


        for(int i=arr.length-1;i>=0;i--)
        {

            if(arr[i]!=' ')
            {

                rev+=arr[i];
            }
            if(arr[(arr.length-1)-i]==' ')
            {
                rev+=" ";
            }


        }

        return  rev;

    }

    public static void main(String[] args)
    {


        System.out.println(reverse("Hello World , How are you"));

    }
}
