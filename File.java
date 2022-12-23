import java.util.*;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

import java.io.*;
class student implements Serializable
{
    int roll=90;
    String name="dgh";
    public String toString()
    {
        return name+" "+roll;
    }
}
public class File {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter paragraph:\n");
        // String para=sc.nextLine();
        // System.out.println(para);
        // FileWriter fw;
        // BufferedWriter bw;
        // FileReader fr;
        // BufferedReader br;
        // try
        // {
        //     // fw= new FileWriter("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
        //     // String[] sent=para.split("[.]");
        //     // for(int i=0;i<sent.length;i++)
        //     // {
        //     //     System.out.println(sent[i]);
        //     // }

        //     //for single character,change bw to fw
        //     // bw =new BufferedWriter(fw);

        //     //     for(int i=0;i<sent.length;i++)
        //     //     {
        //     //         bw.write(sent[i]);
        //     //         bw.write('\n');
                    
        //     //     }
        //     //     bw.close();
        //     // for(int i=0;i<para.length();i++)
        //     // {
        //     //     fw.write((int)para.charAt(i));
        //     // }
        //     // fw.close();
        //     fr =new FileReader("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
        //     br=new BufferedReader(fr);
        //     int ch;
        //     // while((ch=fr.read())!=-1)
        //     // {
        //     //     System.out.print((char)ch+" ");
                
        //     // }
        //     System.out.println(br.readLine());
        // }
        try
        {
            FileOutputStream fos= new FileOutputStream("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(new student());
            fos.close();

            FileInputStream fis= new FileInputStream("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            oos.writeObject(new student());
            fos.close();
            student s= (student)ois.readObject();
            System.out.println(s);
            ois.close();
        }
        catch(Exception e)
        {}
        
        sc.close();
        

    }
}
