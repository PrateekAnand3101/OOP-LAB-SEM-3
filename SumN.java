import java.util.*;

public class SumN {
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nmber n: ");
        n= sc.nextInt();
        sc.close();
        for(i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
        
    }
}
