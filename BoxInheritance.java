import java.util.*;
class Box
{
    double width,height,depth;
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;

    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box()
    {
        width=height=depth=-1;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }

}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double m)
    {
        width=w;
        height=h;
        depth=d;
        weight=m;
    }
}
class BoxInheritance
{
    public static void main(String args[]) {
        BoxWeight mybox1= new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2= new BoxWeight(2, 3, 4, 0.76);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is:"+vol);
        System.out.println("Weight of mybox1 is:"+mybox1.weight);
        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is:"+vol);
        System.out.println("Weight of mybox2 is:"+mybox2.weight);
        
    }   
}
