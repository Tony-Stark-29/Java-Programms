public class String_Basic
{
    public void string_Iterate(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        String_Basic sb=new String_Basic();
        char ch='A';
        int alphabet=26-Math.abs('b'-'z');
        //System.out.println(alphabet);

        String str="Hel lo";
        int strLen=str.length();
        System.out.println(str.charAt(strLen-1));


        char c1='A';
        char c2='B';

        String str23=""+c1+c2;

        System.out.println(str23);

        sb.string_Iterate("Hello World ");


        System.out.println((char)('A'+1));
        System.out.println("% :"+str.charAt(3)+"|");

    }
}
