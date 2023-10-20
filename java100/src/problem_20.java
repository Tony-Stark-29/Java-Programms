public class problem_20
{

    public static boolean isNumber(String num)
    {
        try
        {
            Integer.parseInt(num);
        }
        catch (Exception ex)
        {
            return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("23"));
        System.out.println(isNumber("Hello"));
        System.out.println(isNumber("/"));

        System.out.println(("78").indexOf("8"));
    }
}
