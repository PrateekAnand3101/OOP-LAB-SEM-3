import java.util.*;
import java.io.*;
class student
{
    String nm;
    int marks;
    student()
    {
        Scanner sc=new Scanner(System.in);
        this.nm=nm;
        this.marks=marks;
        System.out.println("enter name of student:");
        nm=sc.nextLine();
        System.out.println("Enter sessional marks:");
        marks= sc.nextInt();
        
    }
    String getname()
    {
        return this.nm;
    }
    int getmarks()
    {
        return this.marks;
    }
    public String toString()
    {
        return nm+" "+marks;

        
    }
}
public class Filereader {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        
        student stu[]=new student[n];
        for(int i=0;i<n;i++)
        {
            stu[i]=new student();
        }
        FileWriter fw=new FileWriter("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\student.txt");
        for(int i=0;i<stu.length;i++)
        {
            String outputText = stu[i].getname()+":"+stu[i].getmarks()+"\n";
            fw.write(outputText);
            
        }
        fw.close();

        FileReader fr= new FileReader("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\student.txt");
        Scanner s=new Scanner("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\student.txt");
        while(s.hasNextLine())
        {
            String line=s.nextLine();
            String item[]=line.split("[:]");
            for(int i=0;i<item.length;i++)
            {
                System.out.println(item[i]);
            }     
        }
    }
}
