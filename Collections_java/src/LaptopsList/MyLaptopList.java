package LaptopsList;

import java.util.ArrayList;

public class MyLaptopList
{

    public static void main(String[] args)
    {

        Laptop[] lapArr=new Laptop[10];
        ArrayList <Laptop> lapArr2=new ArrayList<>();

          lapArr[0]=new Laptop("Hp","Victus",16,84000);
          lapArr[1]=new Laptop("Hp","Notebook",8,54000);
          lapArr[2]=new Laptop("Lenovo","Legion",32,154000);
          lapArr[3]=new Laptop("Dell","XPS",64,254000);
          lapArr[4]=new Laptop("Asus","Vivobook",8,44000);


          lapArr2.add(lapArr[0]);
          lapArr2.add(lapArr[1]);
          lapArr2.add(lapArr[2]);
          lapArr2.add(lapArr[3]);
          lapArr2.add(lapArr[4]);

        System.out.println("-------------Before Sort-----------");
        System.out.println(lapArr2 );

        System.out.println("-------------After Sort-----------");
        LaptopComp comp=new LaptopComp();
        lapArr2.sort(comp);
        System.out.println(lapArr2);


        for(Object o:lapArr2)
        {
            System.out.println(o);
        }





    }

}
