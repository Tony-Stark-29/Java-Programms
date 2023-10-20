package AtTheCrossRoads;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArithmeticExpression
{
    public static void main(String args[])
    {
        ArithmeticExpression ae=new ArithmeticExpression();
        System.out.println(ae.solution(1,2,1));
    }
    boolean solution(int a, int b, int c)
    {


        int[] num={a,b,c};
        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        if (num[0]+num[1] == num[2])
            return true;
        if (num[0]-num[1] == num[2])
            return true;
        if (num[0]*num[1] == num[2])
            return true;
        if (num[0]/num[1] == num[2])
            return true;
        if (num[0]%num[1] == num[2])
            return true;
        return false;

    }


}
