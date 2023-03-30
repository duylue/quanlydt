package dt.com;

import dt.com.contrler.Controller;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("1 Xem danh sach dt");
            System.out.println("2 them dt");
            System.out.println("3 sua dt");
            System.out.println("4 xoa dt");
            System.out.println("0 thoat");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    controller.xem(); break;
                case 2:
                    controller.them();
                    break;
                case 3:
                    controller.sua();break;
                case 4:
                    controller.xoa();
                    break;
                case 0 :
                    System.exit(1);
                default:
                    System.out.println("yeu cau ton tai");


            }

        }while (true);

    }
}
