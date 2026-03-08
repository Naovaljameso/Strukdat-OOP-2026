// Class abstract = tidak bisa dibuat object langsung
abstract class HewanAbstrak {
    String nama;

    HewanAbstrak(String nama) { this.nama = nama; }

    // Method abstract = WAJIB diisi oleh class anak
    abstract void bersuara();
    abstract String getTipe();

    // Method biasa = sudah ada isinya
    void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}

class Harimau extends HewanAbstrak {
    Harimau(String nama) { super(nama); }

    @Override
    void bersuara()    { System.out.println(nama + ": RAWR! (Harimau)"); }

    @Override
    String getTipe()   { return "Karnivora"; }
}

class Panda extends HewanAbstrak {
    Panda(String nama) { super(nama); }

    @Override
    void bersuara()    { System.out.println(nama + ": Ooh ooh... (Panda)"); }

    @Override
    String getTipe()   { return "Herbivora"; }
}

public class Abstraction {
    public static void main(String[] args) {

        // HewanAbstrak h = new HewanAbstrak("test"); // ERROR! tidak bisa!

        Harimau harimau = new Harimau("Raja");
        harimau.bersuara();
        System.out.println("Tipe : " + harimau.getTipe());
        harimau.tidur();

        System.out.println("---");

        Panda panda = new Panda("Bao");
        panda.bersuara();
        System.out.println("Tipe : " + panda.getTipe());
        panda.tidur();
    }
}