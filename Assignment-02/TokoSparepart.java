import java.util.ArrayList;


public class TokoSparepart {
    private ArrayList<Sparepart> daftarBarang;

    public TokoSparepart() {
        daftarBarang = new ArrayList<>();  

    }

    public void tambahBarang(Sparepart sp) {
    daftarBarang.add(sp);

    }

    public void tampilkanStok() {
        for (Sparepart sp : daftarBarang) {
            sp.displayInfo();
            System.out.println("----------");
        }
    }

}


