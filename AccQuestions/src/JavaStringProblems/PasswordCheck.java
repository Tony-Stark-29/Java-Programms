package JavaStringProblems;
import java.util.*;
import java.util.regex.*;
public class PasswordCheck
{

    public static boolean isStartWithAlphabet(String str)
    {
        Pattern alph= Pattern.compile("a");
         Matcher match=alph.matcher(str);

         return match.matches();
    }

    public static void main(String[] args)
    {

        System.out.println(isStartWithAlphabet("8Hari"));

    }
}
