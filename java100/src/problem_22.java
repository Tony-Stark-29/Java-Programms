public class problem_22
{

    public static String reverseEachWord(String str)
    {
        String strRev="";

        String[] strArr=str.split(" ");

        for(String word:strArr)
        {

            strRev+=new StringBuilder(word).reverse().toString()+" ";

        }


        return strRev;
    }

    public static void main(String[] args)
    {
        System.out.println(reverseEachWord("Java Concept Of The Day"));
        System.out.println(reverseEachWord("Java J2EE JSP Servlets Hibernate Struts"));
        System.out.println(reverseEachWord("I am string not reversed"));
        System.out.println(reverseEachWord("Reverse Me"));


    }

}
