import java.util.ArrayList;
import java.util.List;

public class fungsiInJava {

    private int penjumlahan(int bilangan, int bilangan2) {

        return bilangan + bilangan2;
    }

    private void pengurangan( int bilangan, int bilangan2) {
        System.out.println(bilangan - bilangan2);
    }

    private List<Integer> getList(List<Integer> list) {

        List<Integer> jumlah = new ArrayList<>();
        int tambah = 0;
        for (Integer item : list) {

            tambah = item + tambah;
        }
        jumlah.add(tambah);
        return jumlah;
    }


    public int[] getArray() {
        int []array = new int[2];
        return array;
    }

    public static void main (String [] args) {
        
        fungsiInJava object = new fungsiInJava();
        int bilangan = 5, bilangan2 = 6;
        int hasil = object.penjumlahan(bilangan , bilangan2);
        System.out.println("Hasil jumlah : " + hasil);
        object.pengurangan(bilangan,bilangan2);

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(90);

        List<Integer> jumlah = object.getList(list);
        System.out.println(jumlah.get(0));
    }

}

/*

    12

    0   1   2   3   4   5   6   7...  12
    0   0   2   0   4   0   6   0     12


 */
