public class Oli extends Sparepart {
    // attribute
    private String tipeOli;

    // constructor
    public Oli(String nama, double harga, int stok, String tipeOli) {
        super(nama, harga, stok);
        this.tipeOli = tipeOli;
    }

    // getter
    public String getTipeOli() {
        return tipeOli;
    }

    // override
    @Override
    public void displayInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Tipe: " + tipeOli);
    }
    
}
