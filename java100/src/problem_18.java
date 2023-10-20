public class problem_18
{

    public static boolean isRotation(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }
        return (s1+s1).contains(s2);

    }

    public static void main(String[] args)
    {

        System.out.println(isRotation("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));
        System.out.println(isRotation("JavaJ2eeStrutsHibernate","StrtsHibernateJavaJ2ee"));

    }
}
