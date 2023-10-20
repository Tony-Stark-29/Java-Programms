import java.util.HashMap;
import java.lang.System;
public class Java_HashMap
{

    public static void main(String[] args)
    {
        HashMap Countries=new HashMap();
        // or
        HashMap<String,String> countries=new HashMap<String,String>();

        Countries.put("USA","Washington DC");
        Countries.put("India","New Delhi");
        Countries.put("Russia","Moscow");
        Countries.put("China","Bejing");

        System.out.println(Countries);
        //Countries.remove("USA");
        //Countries.put("USA","Washington DC");
        //System.out.println(Countries);

        System.out.println(Countries.get("USA"));

        System.out.println(Countries.size());

        System.out.println(Countries.containsKey("USA"));

       for(Object i : Countries.keySet())
       {
           System.out.print(i+"    - ");
           System.out.println(Countries.get(i));
       }


        System.out.println();
    }

}
