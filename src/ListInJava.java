import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInJava {

    public static void main (String [] args) {

        List<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(1, 20);

        List<Integer> list2 = new ArrayList<>(list);

        for (int i = 0 ; i<list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        for (Integer item : list2) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);
        // array
        int [][] matriks = new int[2][3];
        for (int i = 0 ; i < matriks.length; i++) {
            for (int j= 0; j<matriks[i].length; j++) {
                System.out.println("Masukkan nilai di indeks " + i + " dan " + j);
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println(matriks.length);
        for (int i = 0 ; i < matriks.length; i++) {
            for (int j= 0; j<matriks[i].length; j++) {
                System.out.print("\t" + matriks[i][j] );

            }
            System.out.println();
        }

    }
}
