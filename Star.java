import java.util.Scanner;

public class Star {
    public static void main(String args[])
    {
        int n,line,star;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines:");
        n=sc.nextInt();
        sc.close();
        for(line=1;line<=n;line++)
        {
            for(star=1;star<=line;star++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
