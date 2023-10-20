import java.util.HashMap;

public class problem_12
{

    public static void eachOcc(String str)
    {
        HashMap<Character,Integer> occurance=new HashMap<>();

        char[] charArray=str.toCharArray();

        for(char c:charArray)
        {
            if(c!=' ')
            {
                if(occurance.containsKey(c))
                {
                    occurance.put(c, occurance.get(c)+1);
                }
                else if(!occurance.containsKey(c))
                {
                    occurance.put(c,1);
                }
            }
        }
        System.out.println(occurance);
    }

    public static void main(String[] args)
    {

        eachOcc("J2EE core Java");

    }
}
