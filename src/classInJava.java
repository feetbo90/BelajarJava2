import java.util.Scanner;

public class classInJava {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Berapa Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan Banyak Tugas : ");
        int jumlahTugas = input.nextInt();


        dataMahasiswa object = new dataMahasiswa();

        object.setDataMahasiswa(jumlahMahasiswa, jumlahTugas);
        object.getDataMahasiswa(jumlahMahasiswa, jumlahTugas);
    }
}