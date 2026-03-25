public class Main {
    public static void main(String[] args) {
        TokoSparepart toko = new TokoSparepart();

        Oli oli1 = new Oli("Castrol", 60000, 8, "10W-20");
        Oli oli2 = new Oli("Enduro", 45000, 20, "20W-40");
        Ban ban1 = new Ban("Federal", 195000, 6, "70/90-17");

        toko.tambahBarang(oli1);
        toko.tambahBarang(oli2);
        toko.tambahBarang(ban1);

        toko.tampilkanStok();

    }
    
}
