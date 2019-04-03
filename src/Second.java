/*

    if else

    if(true){
    }



 */

import java.util.Scanner;

public class Second {
    public static void main (String [] args){
        System.out.println("input bilangan");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        switch (bilangan) {
            case 1:
                System.out.println("ini satu ");
                break;
            case 2:
                System.out.println(" ini dua ");
        }

        if (bilangan == 1) {
            System.out.println("ini satu");
        }
        else
            System.out.println("ini dua");

    }
}
