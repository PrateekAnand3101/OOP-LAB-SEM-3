import java.util.*;
public class ReverseArray {

    public static void reverse(int a[])
    {
        int first=0,last=a.length-1;
        while(first<last)
        {
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;

            first++;
            last--;
        }
        
    }
    public static void main(String args[])
    {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements:");
        n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        reverse(a);
        System.out.println("The reversed array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
            
        }
        
    }
}
