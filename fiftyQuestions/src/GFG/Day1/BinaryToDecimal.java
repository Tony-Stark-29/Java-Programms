package GFG.Day1;

public class BinaryToDecimal
{
    public static int DecimalConvertion(int bi) {
        int dec = 0;
        int pow = 0;
        String binary = Integer.toString(bi);

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                dec += Math.pow(2, pow);
            }
            pow++;
        }

        return dec;
    }
    public static void main(String[] args)
    {

        System.out.println(DecimalConvertion(10001000));
        System.out.println(DecimalConvertion(101100));

    }
}
