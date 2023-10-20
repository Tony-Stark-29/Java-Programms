import java.util.Scanner;

public class s
{

        public static void main (String[] args)
        {
            Scanner read = new Scanner(System.in);

            int t = read.nextInt();
            for(int i=0; i<t; i++)
            {
                int x = read.nextInt();

                if(x==0)
                {
                    System.out.println("0");
                }
                else
                {

                    int n=(int)Math.ceil(x/3);
                    int r=n-x;

                    System.out.println(r);

                }


            }

    }
}
