import java.util.Scanner;

public class InvertedStar {
    public static void main(String args[])
    {
        int n,line,star;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        n=sc.nextInt();
        sc.close();
        for(line=1;line<=n;line++)
        {
            for(star=1;star<=n-line+1;star++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

