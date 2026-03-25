public abstract class Sparepart {

    private String nama;
    private double harga;
    private int stok;

    // constructor
    public Sparepart(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // getter
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }

    // method
    public abstract void displayInfo();
 
}
