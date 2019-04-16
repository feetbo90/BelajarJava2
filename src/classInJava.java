public class classInJava {

    public static void main (String [] args) {

        Mahasiswa budi = new Mahasiswa("budi", "mariendal", "080803069", "TI");
        System.out.println("Nama : " + budi.getNama() + "\nAlamat : " + budi.getAlamat() +
            "\nNIM : " + budi.getNIM() + "\nJurusan : " + budi.getJurusan());

        System.out.println(budi.ambilNamaOrangTua());


        System.out.println(budi.getNIM("tambahan"));
    }

}
