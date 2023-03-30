package exep;

public class MyExep extends RuntimeException{

    public MyExep(String message, String status ) {
        System.out.println(message);
        System.out.println(status);
    }
}
