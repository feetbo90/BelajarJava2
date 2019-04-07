import java.util.Scanner;

public class StrukturKeputusan {



    /*
        operator perbandingan
        > , < , >=, <=, == , !=
        true, false

        operator logika

        &&, ||
        T    T    T
        T    F    F
        F    T    F
        F    F    F

        ||
        T   T     T
        T   F     T
        F   T     T
        F   F     F


        if(TRUE)

        90

       nilai > 90 : A
       nilai > 80 dan nilai <=90 : B+
       nilai > 70 dan nilai <=80 : B

     */

    public static void main(String [] args) {

        System.out.println("Masukkan bilangan ");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        System.out.println("Masukkan bilangan kedua");
        int bilanganDua = input.nextInt();

        if(bilangan > bilanganDua) {

            System.out.println("Maka " + bilangan + " terbesar");
        }else {
            System.out.println("Maka " + bilanganDua + " terbesar");
        }

        System.out.println(" Masukkan nilai : ");
        int nilai = input.nextInt();
        if(nilai > 90) {
            System.out.println("A");
        } else if (nilai > 80 && nilai <= 90) {
            System.out.println("B+");
        } else if (nilai > 70 && nilai <= 80) {
            System.out.println("B");
        }

    }
}

/*

    4 bilangan
    100
    90
    100
    90

    380 / 4 = 90


 */
