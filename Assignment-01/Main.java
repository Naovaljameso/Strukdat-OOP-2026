public class Main {
    public static void main(String[] args) {
        // // Hewan 1
        // Hewan hewan1 = new Hewan();
        // hewan1.nama = "Simba";
        // hewan1.jenis = "Singa";
        // hewan1.umur = 5;

        // // Hewan 2
        // Hewan hewan2 = new Hewan();
        // hewan2.nama = "Dumbo";
        // hewan2.jenis = "Gajah";
        // hewan2.umur = 10;

        // Dengan Constructor
        HewanConstructor hewan1 = new HewanConstructor("Simba", "Singa", 5);
        HewanConstructor hewan2 = new HewanConstructor("Dumbo", "Gajah", 10);
        HewanConstructor hewan3 = new HewanConstructor("Timmy", "Kucing");

        hewan1.tampilInfo();
        System.out.println("--------------------");
        hewan2.tampilInfo();
        System.out.println("--------------------");
        hewan3.tampilInfo();
        System.out.println("--------------------");



        Encapsulation hewan = new Encapsulation("Simba", 5);
        hewan.tampilInfo();

        // Coba set umur negatif
        hewan.setUmur(-3);
        hewan.tampilInfo();
    }
}
