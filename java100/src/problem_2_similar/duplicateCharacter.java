package problem_2_similar;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharacter
{


    public static void printDuplicate(String str)
    {

        str=str.replaceAll(" ","");
        str=str.replaceAll("\t","");

        HashMap<Character,Integer> CharCount=new HashMap<>();
        char[] arr=str.toCharArray();

        for(char c:arr)
        {
            if(CharCount.containsKey(c))
            {
                CharCount.put(c,CharCount.get(c)+1);
            }
            else
            {
                CharCount.put(c,1);
            }
        }

        Set<Character> duplicates=CharCount.keySet();

        for(char c:duplicates)
        {
            if(CharCount.get(c)>1)
            {
                System.out.println(c+" - "+CharCount.get(c));
            }
        }
    }

    public static void main(String[] args)
    {

        printDuplicate("Hello     world");

    }
}
