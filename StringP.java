import java.util.*;

class StringP
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,s1;
        System.out.println("Enter the String:\n");
        s=sc.nextLine();
        System.out.println(s.replace('a','e'));
        System.out.println(s.replace("am","was"));
    }
}