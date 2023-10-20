public class Problem_7
{

    public static boolean isAmstrong(int num)
    {
        int sum=0;
        char[] numCopy=String.valueOf(num).toCharArray();
        for ( char c:numCopy)
        {
            int n=1;
            for(int i=1;i<=numCopy.length;i++) {
                n *= Integer.parseInt(c + "");

            }
            sum += n;
        }

        return sum==num;
    }

    public static void main(String[] args){
        System.out.println(isAmstrong(133));
        System.out.println(isAmstrong(153));
    }
}
