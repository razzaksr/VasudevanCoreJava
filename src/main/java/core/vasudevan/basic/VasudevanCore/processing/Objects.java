package core.vasudevan.basic.VasudevanCore.processing;

import core.vasudevan.basic.VasudevanCore.collection.Paper;

import java.io.*;

public class Objects {

    File file=new File("D:\\Course backups\\Java\\Vasudevan\\entity.doc");

    // serialization
    public void writing() throws IOException {
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Paper p1=new Paper();p1.name="DSA";p1.code=9123;p1.internals=50;p1.grade='B';
        oos.writeObject(p1);

        oos.close();
        fos.close();

        System.out.println("Object written @ "+file.getAbsoluteFile());
    }

    // deserialization
    public void reading() throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Paper pep=(Paper)ois.readObject();

        ois.close();
        fis.close();

        System.out.println(file.getName()+" File has content of following \n"+pep);
        System.out.println(pep.internals+20);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Objects obj=new Objects();
        //obj.writing();
        obj.reading();
    }
}
