public class SubString_Java
{
    public static void main(String[] args)
    {
        String str1="Hello World !";
        String str2="Hello";
        String str3="hello";

        System.out.println(str1.equals(str2));

        System.out.println(str1.contains(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str1.substring(2,5));


    }
}
