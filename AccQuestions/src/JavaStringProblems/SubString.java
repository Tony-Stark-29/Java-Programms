package JavaStringProblems;

public class SubString
{

    public static boolean isWordPresent(String str,String word)
    {
        String[] strArr=str.split(" ");

        for(String s:strArr)
        {
            if(s.compareToIgnoreCase(word)==0)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {

        String s = "Geeks for Geeks";
        String word = "geeks";

        if (isWordPresent(s, word))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
