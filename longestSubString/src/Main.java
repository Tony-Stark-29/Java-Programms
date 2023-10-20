import java.security.KeyStore;

public class Main
{
    public boolean check_repeatation(String str,int n,char c)
    {

        for(int i=0;i<n+1;i++)
        {
            if(str.charAt(i)==c)
            {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args)
    {


        String str1="abcabcbb";

        int maxLength=0;
        for(int i=0;i<str1.length();i++)
        {
            StringBuilder CurrentSubString=new StringBuilder();
            for(int j=i;j< str1.length();j++)
            {
                
            }
        }

    }
}