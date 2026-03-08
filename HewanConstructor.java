public class HewanConstructor {
    String nama;
    String jenis;
    int umur;

    // constructor default
    HewanConstructor() {
        this.nama = "Belum diketahui";
        this.jenis = "Belum diketahui";
        this.umur = 0;
    }

    // constructor
    HewanConstructor(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // constructor dengan 2 parameter
    HewanConstructor(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = 0;
    }

    void tampilInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Umur  : " + umur + " tahun");
    }
}