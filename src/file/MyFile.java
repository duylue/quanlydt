package file;

import dt.com.model.Phone;
import exep.MyExep;

import java.io.*;

public class MyFile {
    public static void main(String[] args) {
        output();
        input();
    }

    public void ghiRaFile(Object o, String nameFile) {
        try {
            FileOutputStream fos = new FileOutputStream(nameFile);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(o);
            os.close();
        } catch (Exception e) {
            System.out.println("Loi ghi ra file");
            throw new RuntimeException(e.getMessage());

        }

    }

    ;

    public static void output() {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\duy\\Documents\\duy.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            Object phone = new Phone("Iphone", 1, "truot");
            os.writeObject(phone);
            os.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());

        }

    }

    public Object docFile(String file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object object = ois.readObject();

            ois.close();
            return object;
        } catch (Exception e) {
            System.out.println("loi file");
            throw new MyExep(e.getMessage(),"404");
        }
    }

    public static void input() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\duy\\Documents\\duy.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object phone = ois.readObject();

            ois.close();
            Phone phone1 = (Phone) phone;
            System.out.println(phone1.toString());
        } catch (Exception e) {
            System.out.println("loi");
        }


    }

}
