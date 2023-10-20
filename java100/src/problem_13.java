public class problem_13
{

    public static int greaterNum(int num,int digit)
    {
        int lar=0;

        for(int i=num;i>=0;i--)
        {
//            if(!Integer.toString(i).contains(digit+""))
//            {
//                lar=i;
//                break;
//            }
            int n=i;
            boolean isNotContaine=false;

             while(n!=0)
             {
                 if(n%10==digit)
                 {
                     isNotContaine=true;
                 }
                 n=n/10;
             }

             if(!isNotContaine)
             {
                 return i;
             }

        }

        return lar;
    }

    public static void main(String[] args)
    {

        System.out.println(greaterNum(123, 2));
        System.out.println(greaterNum(4582, 5));
        System.out.println(greaterNum(98512, 5));
        System.out.println(greaterNum(548624, 8));

    }
}
