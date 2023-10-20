package comparator;

import java.util.Comparator;

public class Comparator1 implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        if( (int)(o1.toString().charAt(0)) == (int)(o2.toString().charAt(0)))
        {
            return 0;
        }
        else if((int)(o1.toString().charAt(0)) < (int)(o2.toString().charAt(0)))
        {
            return +1;
        }
        else if ((int)(o1.toString().charAt(0)) > (int)(o2.toString().charAt(0)))
        {
            return -1;
        }

        return 0;
    }
}
