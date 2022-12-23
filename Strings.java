import java.util.*;


public class Strings {
    public static void main(String[] args) {
        // String st="ict  dept    mit   manipal";
        // String s[]=st.split(" + ");
        // for(int i=0;i<s.length;i++)
        // {
        //     System.out.println(s[i]);
        // }

        //getChars() method

        // String s="This is a demo of getChars method";
        // int start=10;
        // int end=13;
        // char buf[]=new char[end-start];
        // s.getChars(start,end,buf,0);
        // System.out.println(buf);

        //getBytes() method

        // String s1="ABCD";
        // byte b[]=s1.getBytes();
        // for(int i=0;i<s1.length();i++)
        // {
        //     System.out.println(b[i]);
        // }

        //toCharArray() method

        // String s="Mit Manipal";
        // int c=0;
        // char ch[]=s.toCharArray();
        // for(int i=0;i<ch.length;i++)
        // {
        //     System.out.println(ch[i]);
        //     if(ch[i]=='a')
        //     {
        //         c++;
        //         System.out.println("count"+c);
        //     }
                
        // }

        // StringBuffer concept
        // StringBuffer sb= new StringBuffer("Hello");
        // System.out.println(sb.append("java"));
        // System.out.println(sb.insert(1, "java"));
        // System.out.println(sb.replace(1, 3, "java"));
        // System.out.println(sb.delete(1, 3));
        // System.out.println(sb.reverse());
        // System.out.println(sb.capacity());

        StringBuffer s1=new StringBuffer("Manipal Institute of Technology");
        s1.delete(8, 24);
        System.out.println("After delete: "+s1);
        s1.deleteCharAt(0);
        System.out.println(s1);


    }
}
