import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class dataMahasiswa {

    private Scanner input = new Scanner(System.in);
    private List<String> namaMahasiswa = new ArrayList<>();
    private List<Integer> nilaiMahasiswa = new ArrayList<>();
    /*
        dataMahasiswa(Integer jumlahMahasiswa, Integer jumlahTugas){
            String [] daftarNama = new String[jumlahMahasiswa];
            int [][] daftarNilai = new int[jumlahMahasiswa][jumlahTugas];
            float [] totalNilai = new float[jumlahMahasiswa];
            float [] ratarataNilai = new float[jumlahMahasiswa];
            String [] nilai = new String[jumlahMahasiswa];
        }
    */
    void setDataMahasiswa(Integer jumlahMahasiswa, Integer jumlahTugas){
        for (int i = 0; i < jumlahMahasiswa; i++ ){
            System.out.print("Masukkan Nama Mahasiswa : ");
            this.namaMahasiswa.add(input.next());
            for (int j = 0; j < jumlahTugas ; j++ ){
                System.out.print("Masukkan nilai " +this.namaMahasiswa + " Tugas ke " +(j)+ ": ");
                this.nilaiMahasiswa.add(input.nextInt());
            }
        }
    }

    void getDataMahasiswa(Integer jumlahMahasiswa, Integer jumlahTugas){
        int jumlah = 0;
        for (int i = 0; i < jumlahMahasiswa; i++){
          System.out.print("\n"+ namaMahasiswa.get(i)+"\t");
        for (int j = 0; j < jumlahTugas; j++){


            System.out.print("\t"+ nilaiMahasiswa.get(jumlah));
            jumlah++;
            }
        }
    }
}
