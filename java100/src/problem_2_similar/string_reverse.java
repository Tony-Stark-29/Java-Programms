package problem_2_similar;

public class string_reverse
{

    public static String reverseByLoop(String str)
    {
        String newStr= "";

        for(int i=(str.length()-1);i>=0;i--)
        {
            newStr+=str.charAt(i);

        }

        return newStr;
    }

    public  static String reverseBySB(String str)
    {

        StringBuffer revStr=new StringBuffer(str);

        return revStr.reverse().toString();

    }

    public static String reverseByRec(String str)
    {

        if(str.length() ==1 )
            return str;

        return reverseByRec(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args)
    {

        System.out.println(reverseByLoop("Hello World "));
        System.out.println(reverseBySB("Hello World "));
        System.out.println(reverseByRec("Hello World "));

    }
}
