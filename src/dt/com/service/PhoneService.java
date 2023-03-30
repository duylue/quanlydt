package dt.com.service;

import dt.com.model.SmartPhone;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class PhoneService {
    private static ArrayList<SmartPhone> list;

    public void them(SmartPhone smartPhone) {
        list.add(smartPhone);
        System.out.println("ban da tao thanh cong");

    }

    public void sua(SmartPhone smartPhone)  {
        for (int i = 0; i < list.size(); i++) {
            if (smartPhone.getId()== list.get(i).getId()){
                list.get(i).setName(smartPhone.getName());
                break;
            }

        }
    }

    public void xoa(int id) {
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
        if (list == null) {
            list = new ArrayList<>();
            SmartPhone smartPhone = new SmartPhone("ipx", 1, "cam ung", "apple", 200000);
            SmartPhone smartPhone1 = new SmartPhone("ip11", 2, "cam ung", "apple", 100000);
            SmartPhone smartPhone2 = new SmartPhone("s1", 3, "cam ung", "sam sung", 2400000);
            list.add(smartPhone);
            list.add(smartPhone1);
            list.add(smartPhone2);
        }
        return list;
    }

}
