package core.vasudevan.basic.VasudevanCore.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Decrypting {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Course backups\\Java\\Vasudevan\\queen.doc");

        FileInputStream fis=new FileInputStream(file);
        InflaterInputStream iis=new InflaterInputStream(fis);

        byte[] arr=new byte[fis.available()];
        iis.read(arr);
        iis.close();
        fis.close();

        String tmp=new String(arr);
        System.out.println(file.getAbsoluteFile()+" contains following content \n"+tmp);
    }
}
