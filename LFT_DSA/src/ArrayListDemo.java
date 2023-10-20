import java.util.Arrays;
import java.util.Scanner;


class DynamicArray<Type>
{

    private static final int iniCapacity=16;
    private Type arr[];
    private int currSize,maxCapacity;

    DynamicArray()
    {
        currSize=0;
        maxCapacity=iniCapacity;
        arr=(Type[]) new Object[maxCapacity];

    }

    public void insertAtEnd(Type val)
    {

       if(currSize==maxCapacity)
       {
           expandArray();
       }
        arr[currSize++]=val;
    
    }

    private void expandArray()
    {
            maxCapacity*=2;
            arr =Arrays.copyOf(arr,maxCapacity);
    }

    public void displayArray()
    {

        for(int i=0;i<currSize;i++)
        {
            System.out.print(arr[i]+",");
        }
    }


    public void insertAtPosition(int pos, Type val)
    {
        if(currSize==maxCapacity)
            expandArray();
        for(int i=currSize-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        currSize++;
    }

    public void deleteAtPosition(int pos)
    {

        if(currSize<0)
            System.out.println("No1 Element to Delete ");
        for(int i=pos;i<=currSize;i++)
        {
            arr[i]=arr[i+1];
        }
        currSize--;

        if(currSize<iniCapacity && maxCapacity>2*iniCapacity )
            srinkArray();

    }
    public void ArrayLength()
    {

    }

    private void srinkArray()
    {
        maxCapacity/=2;
        arr=Arrays.copyOf(arr,maxCapacity);
    }
}

public class ArrayListDemo
{
    public static void main(String[] args)
    {

        int choice,val,pos;
        Scanner scan=new Scanner(System.in);
         DynamicArray<Integer> arr1=new DynamicArray<Integer>();

        while(true)
        {
            System.out.println("\n---------------List Menu---------------");
            System.out.println("\n1.Insert at End");
            System.out.println("\n2.Display the list");
            System.out.println("\n3.Insert at specified position");
            System.out.println("\n4.Delete at specified position");
            System.out.println("\n5.Exit");

            System.out.print("Enter your choice : ");
            choice= scan.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Value : ");
                    val=scan.nextInt();
                    arr1.insertAtEnd(val);
                    break;
                case 2:
                    arr1.displayArray();
                    break;
                case 3:
                    System.out.println("\nPosition : ");
                    pos=scan.nextInt();
                    if(pos<0)
                    {
                        System.out.println("! Invalid Position ");
                        break;
                    }
                    System.out.println("\nValue : ");
                    val=scan.nextInt();
                    arr1.insertAtPosition(pos,val);
                    break;
                case 4:
                    System.out.println("\nPosition : ");
                    pos=scan.nextInt();
                    if(pos<0)
                    {
                        System.out.println("! Invalid Position ");
                        break;
                    }
                    arr1.deleteAtPosition(pos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice !");
            }

        }
        
    }

    public void insertEnd(int[] arr)
    {

    }

    public void Display_array(int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public void insert_at_Position(int[] arr)
    {

    }

    public void delete_at_Position(int[] arr)
    {

    }

    public void print(int[] arr)
    {

    }
}
