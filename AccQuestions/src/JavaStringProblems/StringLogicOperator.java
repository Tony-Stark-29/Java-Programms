package JavaStringProblems;

public class StringLogicOperator
{

    public static int CalculateLogicOperator(String str)
    {

        return 0;
    }
    public static void main(String[] args)
    {

        String str="1C0C1C1A0B1";

        int result=0;
        char operator='B';

        StringBuilder sb=new StringBuilder();


        for(char c:str.toCharArray())
        {
           if( Character.isAlphabetic(c))
           {
               operator=c;
           }
           else if(Character.isAlphabetic(c))
           {

               int num=Integer.parseInt(Character.toString(c));
               switch (c)
               {
                   case 'A':
                        result&=num;
                       break;
                   case 'B':
                       result|=num;
                       break;
                   case 'C':
                       result^=num;
                       break;
                   default:
                       sb.append("");
                       break;
               }

           }
            System.out.println(result);
        }

        System.out.println(result);


    }
}
