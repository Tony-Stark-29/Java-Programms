public class BetweenNumbers
{
    int arr[]={00,11,12,13,14,15,16,17,18,19,20,21,22,23};
    int size=arr.length -1;
    int count=0;
    void countNonReapeatDigit()
    {
        for(int i=0;i<=size;i++)
        {
            if(!checkRepeatDigit(arr[i]))
            {
                count++;
            }
        }
    }

    boolean checkRepeatDigit(int digit)
    {

        if(digit/10 == digit%10)
        {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args)
    {
        BetweenNumbers bn=new BetweenNumbers();
        bn.countNonReapeatDigit();
        System.out.println("Total Element : "+Integer.toString(bn.arr.length));
        System.out.println("Non Repeat Element : "+Integer.toString(bn.count));
        System.out.println("Repeat Element : "+Integer.toString(bn.arr.length- bn.count ));
    }
}
