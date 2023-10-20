import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DuplicateWordCount
{
    void CountDuplicateString(String input)
    {
        input=input.toLowerCase();
        String[] splittedString=input.split(" ");

        HashMap<String,Integer> count=new HashMap<String,Integer>();

        System.out.println(Arrays.toString(splittedString));

        for(String str:splittedString)
        {
            if(!count.containsKey(str))
            {
                count.put(str,1);
            }
            else if(count.containsKey(str))
            {
                count.replace(str, count.get(str)+1);
            }
            System.out.println(count);

        }

        final Set< String > wordsInString = count.keySet();

        for (String s:wordsInString)
        {
            if(count.get(s)>1  )
            {
                System.out.println(s+" : "+count.get(s));
            }
        }

        System.out.println(count);

    }
    public static void main(String[] args)
    {

        DuplicateWordCount d1=new DuplicateWordCount();
        d1.CountDuplicateString("Java is java again java");

    }
}
