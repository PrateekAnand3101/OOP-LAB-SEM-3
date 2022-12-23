import java.util.*;
class MyMessage1
{
    void dispMessage1()
    {
        System.out.println("Welcome");
    }
}
class MyMessage2 extends MyMessage1
{
    void dispMessage2()
    {
        System.out.println("MIT, Manipal");
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        MyMessage2 m2= new MyMessage2();
        m2.dispMessage1();
        m2.dispMessage2();

    }
}
