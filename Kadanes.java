import java.util.*;
public class Kadanes {

    public static void kadane(int a[])
    {
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i=0;i<a.length;i++)
        {
            curr+=a[i];
            if(curr<0)
            {
                curr=0;
            }
            max=Math.max(curr, max);
        }
        System.out.println("Max subarray sum is:"+max);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("ENTER THE NO. OF ELEMENTS:");
        n=sc.nextInt();
        int a[]= new int[n];
        System.out.println("ENTER THE ELEMENTS:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        kadane(a);
    }
}
