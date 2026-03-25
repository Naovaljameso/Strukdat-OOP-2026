public class Ban extends Sparepart {

    // attribute
    private String ukuran;

    // constructor
    public Ban(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok);
        this.ukuran = ukuran;
    }

    // getter
    public String getUkuran() {
        return ukuran;
    }

    // override
    @Override
    public void displayInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Ukuran: " + ukuran);
    }
    


}
