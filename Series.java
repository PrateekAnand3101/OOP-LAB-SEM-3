import java.util.Scanner;
public class Series {
    public static void main(String args[])
    {
        int a;
	Scanner sc= new Scanner(System.in);
      	System.out.println("Enter case 1/2");
	a=sc.nextInt();
    sc.close();
        if(a!=1 && a!=2)
        {
            System.out.println("Invalid Case");
            return;
        }
        else if(a==1)
        {
            float i=1;
            float sumnew=0;
            float sumold=0;
            while(true)
            {
                sumnew+=Math.pow((1/i),i);
                if(sumnew==sumold)
                {
                    break;
                }
                i++;
                sumold=sumnew;
            }
            System.out.println("The sum of infinite series is:"+sumnew);
        }
        else
        {
            int b;
      	System.out.println("Enter number");
	b=sc.nextInt();
            int i=1;
            float sumnew=0;
            float sumold=0;
            float multiplier=1;
            while(true)
            {
                float fact=1f;
                for(int j=2; j<=i; j++) fact*=j;
                sumnew+=Math.pow(b,i)/fact*multiplier;
                if(sumnew==sumold)
                {
                    break;
                }
                multiplier*=-1;
                i+=2;
                sumold=sumnew;
            }
            System.out.println("Sin("+b+")="+sumnew);
        }
    }
}
