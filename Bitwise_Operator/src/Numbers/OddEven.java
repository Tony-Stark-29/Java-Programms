package Numbers;

public class OddEven
{
    boolean isOdd(int val)
    {
        return (val & 1) == 1;
    }
    boolean isEven(int val)
    {
        return (val & 1) == 0;
    }
}
