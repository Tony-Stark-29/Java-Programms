import com.sun.source.tree.PackageTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1
{
    public static void main(String[] args)
    {

        String num1="1234-5678-9101";

        Pattern pattern =Pattern.compile("[0-9]{4}+-[0-9]{4}+-[0-9]{4}");
        Matcher matcher=pattern.matcher(num1);

        if(matcher.find())
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }

    }
}
