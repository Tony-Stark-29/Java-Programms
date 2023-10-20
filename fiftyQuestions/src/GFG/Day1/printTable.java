package GFG.Day1;

import java.sql.SQLOutput;

public class printTable
{
    public static void Table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i*n+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {

        Table(1);
        Table(2);
        Table(3);
        Table(4);
        Table(5);
        Table(6);
        Table(7);
        Table(8);
        Table(9);
        Table(10);

    }
}
