package OOPs_1;

import java.sql.SQLOutput;

public class Student
{
    String name;
    int rollno;
    float mark;

    Student()
    {
      this("san",23,8.5f);
    }


    Student(String name,int rollno,float mark)
    {
        this.name=name;
        this.mark=mark;
        this.rollno=rollno;
    }

    public void print()
    {
        System.out.println("Name :"+name);
        System.out.println("RollNo :"+rollno);
        System.out.println("Mark : "+mark);
    }
}
