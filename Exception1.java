import java.util.*;
class Exception1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[10];
        int i;
        // while(true)
        // {
        //     System.out.println("Enter any valid integer:\n");
            
        //     try{
        //         n=Integer.parseInt(sc.next());
        //         System.out.println("You entered:"+n);
        //     }
        //     catch(NumberFormatException e){
        //         System.out.println("NumberFormatException occurred");
        //     }
        // }
        for (i=0;i<=10;i++)
        {
            n[i]=sc.nextInt();
        }
        try {
            if(n[i]>20)
            {
                System.out.println("Invalid");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of bounds");
        }

    }
}