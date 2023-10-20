public class problem_3
{

    public static String removeByMethod(String str)
    {
        str=str.replaceAll("\\s","");
        return str;
    }

    public static  String removeByLoop(String str)
    {

        String newStr="";

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ' && str.charAt(i)!='\t')
            {
                newStr+=str.charAt(i);
            }
        }

        return newStr;

    }

    public static void main(String[] args)
    {

        System.out.println(removeByMethod("hello world how are\tyou "));
        System.out.println(removeByLoop("hello world how are\tyou "));


    }
}
