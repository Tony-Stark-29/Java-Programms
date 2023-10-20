public class problem_9
{

    public static int sumOfAll1(int num)
    {
        if(num==0 || num <0)
        {
            return 0;
        }
        return num%10 + sumOfAll1(num/10);
    }


    public static void main(String[] args)
    {

        System.out.println(sumOfAll1(123));
        System.out.println(sumOfAll1(47862));;
        System.out.println(sumOfAll1(416872));;
        System.out.println(sumOfAll1(5674283));;
        System.out.println(sumOfAll1(475496215));;

    }
}
