public class StringPalindrome
{


    static boolean isPalindrome(String str)
    {
        boolean palindrome=false;
        int i,j;
         for (i=0;i<str.length()-1;i++)
         {
            for(j=str.length()-1;j>=0;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    palindrome=true;
                }
                else
                {
                    return false;
                }
            }
         }
         return palindrome;

    }
    public static void main(String[] args)
    {

        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("dadg"));


    }
}
