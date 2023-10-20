package problem_2_similar;

import java.util.Arrays;

public class Anagram
{


    public static boolean isAnagramByFun(String str1,String str2)
    {

        str1=str1.replaceAll("\\s","");
        str2=str2.replaceAll("\\s","");

        if(str1.length() ==str2.length())
        {
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            System.out.println(arr1);
            System.out.println(arr2);


            return  Arrays.equals(arr1,arr2);
        }

        return false;
    }


    public static boolean isAnagramByIterative(String str1,String str2)
    {

        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        System.out.println(str1+" "+str2);


        if(str1.length()==str2.length())
        {

            char[] str1ToArr=str1.toCharArray();

            for(char c:str1ToArr)
            {

                    int index=str2.indexOf(c);
                    str2.indexOf(c);str2=str2.substring(0,index)+str2.substring(index+1,str2.length());

            }

        }


        return str2.equals("");
    }


    public static boolean isAnagramBySb(String str1,String str2)
    {

        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        StringBuilder strBuild=new StringBuilder(str2);

        if(str1.length()==str2.length())
        {

            char[] str1ToArr=str1.toCharArray();


            for(char c:str1ToArr)
            {
                strBuild.deleteCharAt(strBuild.indexOf(c+""));
            }

        }
        return strBuild.isEmpty();
    }
    public static void main(String[] args)
    {

        //System.out.println(isAnagramByFun("Peek","Pkee"));
        System.out.println(isAnagramByIterative("P eek","Pk  ee"));
        System.out.println(isAnagramByIterative("SiLeNt CAT", "LisTen AcT"));
        System.out.println(isAnagramBySb("SiLeNt CAT", "LisTen AcT"));

    }
}
