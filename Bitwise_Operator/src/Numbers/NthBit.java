package Numbers;

public class NthBit
{

    int changeNthBit(int num,int pos)
    {
        int temp=1<<pos;
        return num ^ temp;
    }

    int getNthBit(int num ,int pos)
    {

        return (num>>pos) & 1;
    }
}
