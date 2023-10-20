import java.lang.management.PlatformLoggingMXBean;
import java.util.Locale;

public class Palindrome
{

    public boolean IsPalindrome(String str)
    {
        str=str.toLowerCase(Locale.ROOT);
        boolean isPalindrome=false;

        for(int i=0;i<str.length()/2;i++)
        {
            for(int j=str.length()-1;j>str.length()/2;j--)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    isPalindrome=true;
                }
                else
                {
                    isPalindrome=false;
                }
            }
        }
        if(isPalindrome)
        {
            return true;

        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {

        Palindrome p=new Palindrome();

        boolean result;
        result= p.IsPalindrome("Kayak");
        System.out.println(result);
        result= p.IsPalindrome("कड़क");
        System.out.println(result);
        result= p.IsPalindrome("Malayalam");
        System.out.println(result);

    }
}
