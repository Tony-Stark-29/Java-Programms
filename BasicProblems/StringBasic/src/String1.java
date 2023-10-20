public class String1
{
    String makeString(String str)
    {
        String newStr="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i++);
            int count=Character.getNumericValue(str.charAt(i));
            for(int j=1;j<=count;j++)
            {
                newStr+=c;
            }
        }

        return newStr;
    }
    public static void main(String[] args)
    {

        String1 s1=new String1();
        System.out.println(s1.makeString("a1b2c3"));

    }
}
