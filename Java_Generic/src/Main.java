public class Main {
    public static void main(String[] args)
    {
        Integer[] int_arr={1,2,3,4,5,6,7,8,9,10};
        Character[] char_arr={'A','B','C','D','E','F','G','H','I','J'};
        Double[] dbl_arr={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.0};
        String[] str_arr={"One","Two","Three","Four","Five"};

        display(int_arr);
        display(char_arr);
        display(dbl_arr);
        display(str_arr);

    }

    public static <type> void display(type[] arr)
    {
        for(type x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}