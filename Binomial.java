import java.util.*;
public class Binomial {

    public static int fact1(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
        return f;
    }
    
    public static int fact2(int r) 
    {
        int f1=1;
        for(int i=1;i<=r;i++)
        {
            f1=f1*i;
        }
        System.out.println(f1);
        return f1;
    }

    public static int fact3(int n, int r) 
    {
        int f2=1;
        int a=n-r;
        for(int i=1;i<=a;i++)
        {
            f2=f2*i;
        }
        System.out.println(f2);
        return f2;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        
        System.out.println("Enter the value of r:");
        r=sc.nextInt();
        sc.close();
        int nCr= fact1(n)/(fact2(r) * fact3(n,r));
        System.out.println(nCr);
    }
}
