package File;
import java.io.File;
import java.io.IOException;
public class FileTest {
    public static void main(String[] args) throws IOException {
      /*  File file=new File(new File("D:\\test\\a"),"b.txt");
        file.createNewFile();
        File file1=new File("D:\\text\\b");
        file1.mkdirs();
        file1.createNewFile();
        if (!file1.exists());{
            file1.mkdirs();
        }
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        File[] files=file1.listFiles();
        for (File f :files ) {
            if (f.isFile()&&f.getName().endsWith(".java")){
                System.out.println(f);
            }
        }
        if (!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.length());
        file1.delete();

*/

        File file2=new File("Day19\\ttt1\\.txt");
        file2.mkdirs();
        file2.createNewFile();


    }
}
