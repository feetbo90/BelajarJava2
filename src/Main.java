
import java.util.Scanner;

/*
    deklarasi variabel
    tipe data nama variabel = nilai;
    Integer bilangan = 10;

 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);
        try {
             input.nextInt();
        }catch (NullPointerException e){
            System.out.println("Scanner tidak membuat objek");
        }
    }
}
