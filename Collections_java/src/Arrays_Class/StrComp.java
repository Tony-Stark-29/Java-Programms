package Arrays_Class;

import java.util.Comparator;

public class StrComp implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        String s1=o1.toString();
        String s2=o2.toString();
        if(s1.length() > s2.length())
        {
            return -1;
        }
        else if(s1.length() < s2.length())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
