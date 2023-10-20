package Arrays_Class;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays_obj_Sort_Comp
{

    String str;

    Arrays_obj_Sort_Comp(String name)
    {
        this.str=name;
    }



    public static void main(String[] args)
    {

        Arrays_obj_Sort_Comp obj1=new Arrays_obj_Sort_Comp("John");
        Arrays_obj_Sort_Comp obj2=new Arrays_obj_Sort_Comp("Michal");
        Arrays_obj_Sort_Comp obj3=new Arrays_obj_Sort_Comp("Apple");
        Arrays_obj_Sort_Comp obj4=new Arrays_obj_Sort_Comp("John");

        Arrays_obj_Sort_Comp[] arr={obj1,obj2,obj3,obj4};


        MyComp comp=new MyComp();

        System.out.println(Arrays.toString(arr));

        System.out.println(obj1.equals(obj1));


    }

}


