package dt.com.service;

import dt.com.model.SmartPhone;
import file.MyFile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class PhoneService {
    private static ArrayList<SmartPhone> list = new ArrayList<>();
     private static final String fileName  = "dt.txt";
    MyFile myFile = new MyFile();

    public void them(SmartPhone smartPhone) {

        list.add(smartPhone);
        myFile.ghiRaFile(list,fileName);;
    }

    public void sua(SmartPhone smartPhone)  {
        xem();
        for (int i = 0; i < list.size(); i++) {
            if (smartPhone.getId()== list.get(i).getId()){
                list.get(i).setName(smartPhone.getName());
                break;
            }

        }
    }

    public void xoa(int id) {
        xem();
        try {
            for (int i = 0; i < list.size(); i++) {
                if (id== list.get(i).getId()){

                    list.remove(i);
                    break;
                }

            }

        }catch (Exception e){
            System.out.println("loi");
        }

    }
void start(){

}
    public ArrayList<SmartPhone> xem() {

        list = (ArrayList<SmartPhone>) myFile.docFile(fileName);
        return list;
    }

}
