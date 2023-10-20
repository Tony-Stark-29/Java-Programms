package Numbers;

public class PowerOfTwo {

    boolean isPowerOfTwo(int val)
    {
        if(val<=0)
        {
            return false;
        }
        return (val & (val-1))==0;

    }

     
}
