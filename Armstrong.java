import java.util.Scanner;

class Armstrong{
    public static void main(String args[]) {
        int n,dig;
        int k=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:\n");
        n=sc.nextInt();
        sc.close();
        int temp=n;
        while(n>0)
        {
            dig=n%10;
            k+=dig*dig*dig;
            n=n/10;
        }
        if(k==temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println(" not an Armstrong number");
        }
    }
}