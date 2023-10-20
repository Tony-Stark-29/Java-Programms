package Numbers;

public class RevEachBit
{


    public static int reverseBits(int n)
    {
        int size=Integer.SIZE;
        while(size!=0)
        {
            n=n<<1;
            size--;
        }
        return n;
    }
    public static void main(String[] args)
    {

        System.out.println(reverseBits(2));
        System.out.println(reverseBits(4));
        System.out.println(reverseBits(64));

    }
}
