import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class EliminationCharacter
{

    HashMap<Character,Integer> charCount=new HashMap<>();
    ArrayList<Integer> count=new ArrayList<>();


    void storeChar(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(!charCount.containsKey(str.charAt(i)))
            {
                charCount.put(str.charAt(i),0);
            }
            if(charCount.containsKey(str.charAt(i)))
            {
                charCount.put(str.charAt(i),charCount.get(str.charAt(i))+1);
            }
            System.out.println(charCount);
        }

        Collection getvalue=charCount.values();
        Iterator ir = getvalue.iterator();
        while (ir.hasNext())
        {
            count.add((Integer) ir.next());
        }




    }

    int ChartoRemove()
    {
        for(int i=0;i<charCount.size();i++)
        {

        }
        return 0;
    }


    public static void main(String[] args)
    {

        String str="aaaaabbc";

        EliminationCharacter ec=new EliminationCharacter();
        ec.storeChar(str);





    }

}
