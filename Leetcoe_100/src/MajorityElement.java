public class MajorityElement
{

    public static int majorityElement(int[] arr)
    {

        int elm=0;
        int count=0;

        for(int num:arr)
        {
            if(count==0)
            {
                elm=num;

            }

            if(num==elm)
            {
                count++;
            }
            else
            {
                count--;
            }

            System.out.println(elm+"-"+count);
        }

        return elm;

    }
    public static void main(String[] args)
    {
        System.out.println(majorityElement(new int[] {0,1,2,2,3,0,4,2}));
        System.out.println(majorityElement(new int[] {2,3,3,2}));
        System.out.println(majorityElement(new int[] {6,5,5}));
    }
}
