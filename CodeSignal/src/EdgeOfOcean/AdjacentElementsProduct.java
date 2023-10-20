package EdgeOfOcean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AdjacentElementsProduct
{
    public static void main(String args[])
    {
        int[] inputArray ={5, 1, 2, 3, 1, 4};
        AdjacentElementsProduct elm=new AdjacentElementsProduct();
        System.out.println(elm.AdjacentProduct(inputArray));
    }

    int AdjacentProduct(int[] inputArray)
    {
        int product=0;

        for(int i=0;i<inputArray.length-1;i++)
        {

                if(product<inputArray[i]*inputArray[i+1])
                {
                    product=inputArray[i]*inputArray[i+1];
                }

        }

        return product;
    }
}
