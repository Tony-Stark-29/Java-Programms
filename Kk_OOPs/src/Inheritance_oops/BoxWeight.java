package Inheritance_oops;

public class BoxWeight extends Box
{

    public  double weight;


    BoxWeight()
    {
        this.weight=0;
    }

    BoxWeight(double a,double w)
    {
        super(a);
        this.weight=w;
    }

     BoxWeight(double l,double h,double w,double weight)
     {
         super(l,h,w);
         this.weight=weight;
     }

  public  void info()
    {
        System.out.println("BoxWeight Created");
    }
  public void boxSize()
    {
        System.out.println("Box weight : l-"+this.l+" w-"+this.w+" h-"+this.h+" weight-"+this.weight);
    }

    public void boxWeight()
    {
        System.out.println("Weight "+this.weight);
    }

}