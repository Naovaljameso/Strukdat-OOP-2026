class HewanSuara {
    String nama;

    HewanSuara(String nama) { this.nama = nama; }

    void bersuara() {
        System.out.println(nama + " mengeluarkan suara...");
    }
}

class SingaSuara extends HewanSuara {
    SingaSuara(String nama) { super(nama); }

    @Override
    void bersuara() { System.out.println(nama + ": GROARRR! (Singa)"); }
}

class GajahSuara extends HewanSuara {
    GajahSuara(String nama) { super(nama); }

    @Override
    void bersuara() { System.out.println(nama + ": TUUUUT! (Gajah)"); }
}

class KatakSuara extends HewanSuara {
    KatakSuara(String nama) { super(nama); }

    @Override
    void bersuara() { System.out.println(nama + ": KOAK KOAK! (Katak)"); }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Semua ditampung dalam array induk
        HewanSuara[] hewan = {
            new HewanSuara("Hewan Biasa"),
            new SingaSuara("Simba"),
            new GajahSuara("Dumbo"),
            new KatakSuara("Koko")
        };

        // Satu perintah, hasil beda-beda!
        for (HewanSuara h : hewan) {
            h.bersuara();
        }
    }
}