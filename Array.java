// import java.util.Scanner;
// public class Array{
//     public static void main(String args[]){
//         Scanner scan= new Scanner(System.in);
//         int n=scan.nextInt();
//         // int arr[]=new int[n];
//         // System.out.println("Enter the elements:");
//         // for(int i=0;i<n;i++){
//         //     arr[i]=scan.nextInt();
//         // }
//         // int key;
//         // System.out.println("Enter the key:");
//         // key=scan.nextInt();
//         // scan.close();
//         // System.out.print("The output is found at location:");
//         // for(int i=0;i<n;i++){
//         //     if(arr[i]==key){
//         //         System.out.print("a["+i+"] ");
//         //     }
//         // }
//         byte b;
//         b=(byte)n;
//         System.out.println(b);
       
//     }
// }


import java.util.Scanner;

public class Array {
    public static void main(String args[])
    {
        int len;
        Scanner sc= new Scanner(System.in);
      	System.out.println("Enter length");
	len=sc.nextInt();
        int arr[]= new int[len];
        for(int k=1; k<=len;k++)
        {
            arr[k-1]=k;
        }
        for(int i:arr)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}