public class StringPerformance
{
    public static void main(String[] args)
    {

        StringBuilder strb1=new StringBuilder();

        for(int i=0;i<26;i++)
        {
            strb1.append((char)('a'+i));
        }

        System.out.println(strb1);

        String str1="Hello world";

        str1.trim();


    }
}
