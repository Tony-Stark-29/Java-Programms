import java.util.ArrayList;

public class StringConcationation
{
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println('a'+"b");
        System.out.println("a"+"b");

        System.out.println('a'+1);
        System.out.println("a"+1);

        String newStr=34+" "+new ArrayList<>();

        System.out.println(newStr);
        System.out.println(34+" "+new ArrayList<>());


    }
}
