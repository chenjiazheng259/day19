import java.io.*;

public class IoText {
    public static void main(String[] args) throws IOException {
        OutputStream file=new FileOutputStream("Day19\\test\\a.txt",true);
        file.write(99);
        byte[] buf={98,99,100};
        file.write(buf,1,1);
        String string=" 我爱你中国";
        file.write(string.getBytes(),0,5);
        file.close();
        for (int i = 0; i <2 ; i++) {
            file.write("hello".getBytes());
        }
        file.close();
        byte[] bys=new byte[1024];
        int len;
        }
    }

