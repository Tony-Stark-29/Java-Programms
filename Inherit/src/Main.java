import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("---------------Parent Object Calling-------------------- ");
        Parent parent=new Parent();
        System.out.println(parent.pbl);
        System.out.println(parent.prt);
        System.out.println(parent.dft);
        System.out.println("Private varible not accessable");
        parent.publicParent();
        parent.defaultParent();
        parent.protectedParent();
        parent.publicInfo();
        System.out.println("---------------------------------------------------------\n");

        System.out.println("--------------------Child Object Calling----------------- ");
        Child1 child=new Child1();
        System.out.println(child.pbl);
        System.out.println(child.prt);
        System.out.println(child.dft);
        System.out.println("Private varible not accessable");
        child.publicChild();
        child.defaultChild();
        child.protectedChild();
        child.publicInfo();
        System.out.println("---------------------------------------------------------\n");


        Parent PC=new Child2();
        System.out.println("-----------------Parent Variable - Child Object Calling---------- ");
        System.out.println(PC.pbl);
        System.out.println(PC.prt);
        System.out.println(PC.dft);
        System.out.println("Private varible not accessable");
        PC.publicParent();
       PC.defaultParent();
      PC.protectedParent();
        PC.publicInfo();
        System.out.println("---------------------------------------------------------\n");




    }
}