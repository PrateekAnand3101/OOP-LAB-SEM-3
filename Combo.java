import java.util.Scanner;
public class Combo {
    public static void main(String args[])
    {
        int c;
	    Scanner sc= new Scanner(System.in);
      	System.out.println("Enter number");
	    c=sc.nextInt();
        sc.close();
        if(c==1)
        {
            int arr[]={1,2,3,4};
            for(int i:arr)
            {
                for(int j:arr)
                {
                    for(int k:arr)
                    {
                        for(int l:arr)
                        {
                            int num=i*1000+j*100+k*10+l;
                            System.out.println(num);
                        }
                    }
                }
            }
        }
        else if(c==2)
        {
            int arr[]={1,2,3,4};
            for(int i:arr)
            {
                for(int j:arr)
                {
                    if(j!=i){
                    for(int k:arr)
                    {
                        if(k!=i && k!=j){
                        for(int l:arr)
                        {
                            if(l!=k && l!=i && l!=j)
                            {
                            int num=i*1000+j*100+k*10+l;
                            System.out.println(num);
                            }
                        }
                    }
                    }
                }
                }
            }
        }
        else
        {
            System.out.println("Enter a valid case (1/2)");
        }
    }
}
