public class Main {
    public static void main(String[] args)
    {
        String str="ababbabbababccaba";
        String sub="aba";

        String[] arr={};
        int k=0;

        int strLen=str.length();
        int subLen=sub.length()-1;
        int count=0;


        for(int i=0;i<strLen-subLen;i++)
        {
            StringBuffer subStr=new StringBuffer();

            for(int j=i;j<=i+subLen;j++)
            {
                subStr.append(str.charAt(j));

            }

            System.out.println("-"+subStr.toString());
            if(subStr.toString().equals(sub))
            {
                count++;
            }

            System.out.println(subStr);
            subStr.delete(0,subLen);
        }

        System.out.println("Occurance of "+sub+" is "+count);



    }
}