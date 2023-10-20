package Inheritance_oops;

import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {

//        Box emptyBox=new Box();
//        emptyBox.boxSize();
//
//        Box square=new Box(5);
//        square.boxSize();
//
//        Box cube=new Box(5,5,3);
//        cube.boxSize();

        BoxWeight emptyBoxWeight=new BoxWeight();
        emptyBoxWeight.boxSize();


        BoxWeight squareBoxWeight=new BoxWeight(5,10);
        squareBoxWeight.boxSize();

        BoxWeight cubeBoxWeight=new BoxWeight(5,6,7,8);
        cubeBoxWeight.boxSize();


        Box b4=new BoxWeight(2,3);
        b4.info();
        System.out.println(b4.l);




    }


}
