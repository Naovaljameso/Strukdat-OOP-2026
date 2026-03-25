// CLASS INDUK
class HewanInduk {
    String nama;
    String jenis;

    HewanInduk(String nama, String jenis) {
        this.nama  = nama;
        this.jenis = jenis;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    void tampilInfo() {
        System.out.println("Nama : " + nama + " | Jenis : " + jenis);
    }
}

// CLASS ANAK - mewarisi HewanInduk
class Singa extends HewanInduk {

    Singa(String nama) {
        super(nama, "Singa"); // panggil constructor induk
    }

    // Method tambahan khusus Singa
    void mengaum() {
        System.out.println(nama + ": GROARRR!");
    }
}

// CLASS ANAK - mewarisi HewanInduk
class Burung extends HewanInduk {

    Burung(String nama) {
        super(nama, "Burung");
    }

    // Method tambahan khusus Burung
    void terbang() {
        System.out.println(nama + " sedang terbang!");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Singa singa = new Singa("Leo");
        singa.tampilInfo(); // warisan dari HewanInduk
        singa.makan();      // warisan dari HewanInduk
        singa.mengaum();    // khas Singa

        System.out.println("---");

        Burung burung = new Burung("Tweety");
        burung.tampilInfo(); // warisan dari HewanInduk
        burung.makan();      // warisan dari HewanInduk
        burung.terbang();    // khas Burung
    }
}