package problem_2_similar;

import java.util.Arrays;

public class reverseEachWord
{

    public static String reverseWord(String str)
    {

        String rev="";

        String[] arr=str.split(" ");

        System.out.println(Arrays.toString(arr));

        for(String str2:arr)
        {

                StringBuilder strBuild=new StringBuilder(str2);
                rev+=strBuild.reverse().toString()+" ";

        }

        return rev;

    }

    public static void main(String[] args) {

        System.out.println(
                reverseWord("I am trying to be an Programmer"));

    }


}
