public class Encapsulation {

    private String nama;  // private = tidak bisa diakses langsung dari luar
    private int umur;

    Encapsulation(String nama, int umur) {
        this.nama = nama;
        setUmur(umur); // pakai setter agar validasi berjalan
    }

    // GETTER = untuk membaca nilai
    public String getNama() { return nama; }
    public int getUmur()    { return umur; }

    // SETTER = untuk mengubah nilai (dengan validasi!)
    public void setUmur(int umur) {
        if (umur < 0) {
            System.out.println("Umur tidak boleh negatif! Diset ke 0.");
            this.umur = 0;
        } else {
            this.umur = umur;
        }
    }

    void tampilInfo() {
        System.out.println("Nama : " + nama + " | Umur : " + umur + " tahun");
    }
}
