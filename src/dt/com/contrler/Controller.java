package dt.com.contrler;

import dt.com.model.SmartPhone;
import dt.com.service.PhoneService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Controller {
    private PhoneService phoneService = new PhoneService();

    public void xem() {

        ArrayList<SmartPhone> list = phoneService.xem();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }

    public void them() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("Nhap ten");
        smartPhone.setName(scanner.nextLine());
        System.out.println("Nhap id");
        smartPhone.setId(scanner1.nextInt());
        System.out.println("Nhap loai");
        smartPhone.setLoai(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setTenHang(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setPrice(scanner1.nextLong());

        phoneService.them(smartPhone);

    }

    public void sua() {
        Scanner scanner = new Scanner(System.in);
        SmartPhone smartPhone = new SmartPhone();
        System.out.println("Nhap ten");
        smartPhone.setName(scanner.nextLine());
        System.out.println("Nhap id");
        smartPhone.setId(scanner.nextInt());
        System.out.println("Nhap loai");
        smartPhone.setLoai(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setTenHang(scanner.nextLine());
        System.out.println("Nhap hang");
        smartPhone.setPrice(scanner.nextLong());
        phoneService.sua(smartPhone);
    }

    public void xoa() {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap id");
            int id = scanner.nextInt();
            phoneService.xoa(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e.getCause());
        }finally {
            System.out.println("hen gap lai1");
        }

    }
}
