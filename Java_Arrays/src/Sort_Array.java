import java.sql.SQLOutput;
import java.util.Arrays;
public class Sort_Array
{
    public static void main(String args[])
    {
        int[] number={45,76,24,75,34,25,75};
        Arrays.sort(number);
        for(int i=0;i<number.length;i++)
        {
            System.out.print(number[i]+" ");
        }

        System.out.println();
        char[] character={'N','T','h','w','I','A','q','Y'};
        Arrays.sort(character);
        for(int i=0;i<character.length;i++)
        {
            System.out.print(character[i]+" ");
        }

    }
}
