package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countTheRepeation
{

    public static int countTheSequence(String str,String seq)
    {
        int count=0;
        Pattern character=Pattern.compile("."+seq);
        Matcher match=character.matcher(str);
        while(match.find())
        {
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        String str="ababbababababaaaba";

        System.out.println(countTheSequence(str,"aba"));
    }
}


