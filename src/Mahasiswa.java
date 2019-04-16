class Mahasiswa extends Parents{

    private String nama;
    private String alamat;
    private String NIM;
    private String jurusan;

    String getAlamat() {
        return this.alamat;
    }

    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    String getNIM(String baru) {
        this.NIM = baru;
        return this.getNIM();
    }

    String ambilNamaOrangTua() {
        Parents orangTua = new Parents();
        return orangTua.getNamaOrangTua();
    }

    /*public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }

    */

    Mahasiswa(String nama, String alamat, String NIM, String jurusan) {
        this.nama = nama;
        this.alamat = alamat;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }


    String getJurusan() {
        return this.jurusan;
    }
}
