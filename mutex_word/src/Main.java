import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {

        String[] input={"bob","rob","tim","jill"};

        char[] first = input[2].toCharArray();
        char[] second = input[3].toCharArray();
        System.out.println("First : "+first);
        System.out.println("Second : "+second);
        Arrays.sort(first);
        Arrays.sort(second);
        System.out.println(Arrays.equals(first, second));
    }
}