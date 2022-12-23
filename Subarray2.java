import java.util.*;

public class Subarray2 {

    public static void subarray(int a[])
    {
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            int start=i;
           
            for(int j=0;j<a.length;j++)
            {
                int end=j;
                int currSum = start==0? prefix[end]: prefix[end]-prefix[start-1];
                // for(int k=i;k<=end;k++)
                // {
                //     System.out.print(a[k]+" ");
                //     currSum+=a[k];


                // }
                System.out.println(currSum);
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
                
            }
            
            
        }
        System.out.println("The max sum is:"+ maxSum);
    }    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of elements:");
        n= sc.nextInt();

        int a[]= new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        subarray(a);
        sc.close();

    }

}
