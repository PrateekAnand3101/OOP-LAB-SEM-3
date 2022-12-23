import java.util.*;

public class SimpleInterest
{
    public static void main(String args[])
    {
        float p,r,t,si;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter principal amount:");
        p=scan.nextFloat();
        System.out.println("Enter rate of interest:");
        r=scan.nextFloat();
        System.out.println("Enter time:");
        t=scan.nextFloat();
        si= (p*r*t)/100;
        System.out.println("Simple Interest is: "+si);
        scan.close();
    
    }
}