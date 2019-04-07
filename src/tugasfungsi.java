import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tugasfungsi {

    private List<Integer> getList(int bilangan) {

        List<Integer> jumlah = new ArrayList<>();

        for (int i = 0 ; i<=bilangan; i++) {
            if (i % 2 == 0) {
                jumlah.add(i);
            }else
                jumlah.add(0);

        }
        return jumlah;
    }

    private void printList(List<Integer> list) {
        for (Integer item : list) {
            System.out.println(item);
        }
    }


    public static void main (String [] args) {

        System.out.println("Masukkan bilangan : ");
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        List<Integer> list;
        tugasfungsi objek = new tugasfungsi();
        list = objek.getList(bilangan);
        objek.printList(list);

    }
}
