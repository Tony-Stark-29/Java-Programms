

public class problem_1
{


    //StrinfBuffer
    public static String revStrMethod1(String str)
    {
        StringBuffer strBuf=new StringBuffer(str);
        return  strBuf.reverse().toString();
    }

    //recursive
    public static String revStrMethod2(String str)
    {
        if(str==null || str.length()<=1)
        {
            return str;
        }
        System.out.println(str);
       return  revStrMethod2(str.substring(1))+str.charAt(0);
    }


    public static void main(String[] args) {
        System.out.println(revStrMethod1("Hello"));
        System.out.println(revStrMethod2("Hello"));
    }
}
