public class Duplicate_Str
{
    public static void main(String args[])
    {
        String str="information";
        boolean Duplicate=true;

        char c[]=new char[str.length()];

        for(int i=0;i<str.length();i++)
        {
            for (int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==c[j])
                {
                    Duplicate = true;
                }
                else
                {
                    Duplicate=false;
                }

            }
            if(!Duplicate)
            {
                c[i]=str.charAt(i);
            }

            System.out.println(c);
        }


    }
}
