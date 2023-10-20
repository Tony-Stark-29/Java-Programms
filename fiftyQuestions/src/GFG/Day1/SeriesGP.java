package GFG.Day1;

public class SeriesGP
{

        public static void Series(int start,int end,int index)
        {
            --index;
            int n=start;
            while(index!=0)
            {
               start*=n;
                index--;
            }

            System.out.println(start);

        }
        public static void main(String[] args)
        {

            Series(2,2,5);

        }

}
