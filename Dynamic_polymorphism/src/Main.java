import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Animals  animal;
        int a=3;

        Scanner scan=new Scanner(System.in);



       while(a!=0)
       {
           System.out.println("1-Cat \n 2- Dog \n choice (1 or 2) :");
           a=scan.nextInt();
           if(a==1)
           {
               animal=new Cat();
               animal.Speak();
           }
           else if(a==2)
           {
               animal=new Dog();
               animal.Speak();
           }
           else
           {
               System.out.println("Invalid Output !");
           }
       }




    }
}