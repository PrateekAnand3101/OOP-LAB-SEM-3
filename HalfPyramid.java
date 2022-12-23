import java.util.Scanner;

public class HalfPyramid {
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines:");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
