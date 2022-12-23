import java.io.*;


public class FileHandling1 {
    public static void main(String[] args) throws Exception{
        
        FileOutputStream fos=new FileOutputStream("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        String s="welcome to MIT";
        oos.writeObject(s);
        oos.close();
        
        FileInputStream fis=new FileInputStream("C:\\Users\\PRATEEK ANAND\\OneDrive - Manipal Academy of Higher Education\\Desktop\\f1.txt");
        // ObjectInputStream ois=new ObjectInputStream(fis);
        // int data=ois.read();
        int data=fis.readAllBytes();
        System.out.println((char)data);

    }
}
