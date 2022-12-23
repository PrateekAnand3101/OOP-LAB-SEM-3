import java.util.*;

public class Factfn 
{
    
    public static void main(String args[]) {
        int n;
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n= sc.nextInt();
        sc.close();
        factorial(n);
    }


    public static void factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial is:"+f);


    }
}