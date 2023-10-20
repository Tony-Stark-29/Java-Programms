package comparator;

import java.util.Arrays;

public class ArrayComparator
{

        public static void main(String[] args) {
                String[] arr={"Zebra","Fox","Cheetah","Ant","Lion"};

                Comparator1 comp=new Comparator1();
                Arrays.sort(arr,comp);

                System.out.println(Arrays.toString(arr));
        }



}
