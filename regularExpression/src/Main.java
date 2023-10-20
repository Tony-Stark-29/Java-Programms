import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile("agent \\d{3}");
        Matcher matcher=pattern.matcher("agent 001");

        boolean found=matcher.find();

        System.out.println(found );
    }
}