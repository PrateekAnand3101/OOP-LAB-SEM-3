import java.util.*;
import java.io.*;
class Student
{
    String name;
    int marks;
    Student(String name, int marks)
    {
        this.name=name;
        this.marks=marks;        
    }
    public String toString()
    {
        return " name "+name+" marks: "+marks+"\n";
        
    }
}
public class FileHandling {
    public static void main(String[] args) throws IOException {
        
            FileWriter fw=new FileWriter("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\p2.txt",true);
            FileReader fr= new FileReader("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\p2.txt");
            // try (Scanner sc = new Scanner(fr)) {
            // }
            // System.out.println("enter the number of student");
            // int n=sc.nextInt();
            Student s[]=new Student[20];
            s[0]=new Student("Aarav", 99);
            s[1]=new Student("Prateek", 20);
            String s1=s[0].toString();
            String s2=s[1].toString();
            fw.write(s1);
            fw.write(s2);
            fw.close();
            BufferedReader br=new BufferedReader(fr);
            
            // char a[]=s1.toCharArray();
            // System.out.println(a);
            String str;
            while((str=br.readLine())!=null)
            {
                
                System.out.println(str);
            }
            
            
    }
}
