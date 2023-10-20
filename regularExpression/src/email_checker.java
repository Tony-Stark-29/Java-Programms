import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email_checker
{
    public static void main(String args[])
    {
        String email="san@gmail.com";

        Pattern pattern=Pattern.compile("\\w+@\\w.com");
        Matcher matcher=pattern.matcher(email);

        System.out.println(matcher.find()?"Perfect":"Not Perfect");
    }
}
