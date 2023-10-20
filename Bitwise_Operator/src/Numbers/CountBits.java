package Numbers;

public class CountBits
{
    int CountSetBit(int num)
    {

        int count=0;
        while(num!=0)
        {
            num &=(num-1);
            count++;
        }

        return count;
    }

    int CountsetBit2(int num)
    {
        int count=0;

        while(num!=0)
        {
            if((num & 1) == 1)
            {
                count++;
            }
            num=num>>1;
        }

        return count;
    }
}
