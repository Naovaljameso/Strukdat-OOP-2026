public class MemoriDemo {
    public static void main(String[] args) {

        // Ini disimpan di STACK
        int jumlahHewan    = 5;
        double luasKandang = 200.5;
        boolean zooBuka    = true;

        System.out.println("=== DATA DI STACK ===");
        System.out.println("Jumlah hewan : " + jumlahHewan);
        System.out.println("Luas kandang : " + luasKandang);
        System.out.println("Zoo buka?    : " + zooBuka);

        // Ini disimpan di HEAP
        HewanConstructor hewan1 = new HewanConstructor("Simba", "Singa", 5);

        System.out.println("\n=== DATA DI HEAP ===");
        hewan1.tampilInfo();

        
        System.out.println("\n=== REFERENSI OBJECT ===");

        HewanConstructor hewanA = new HewanConstructor("Raja", "Harimau", 3);
        HewanConstructor hewanB = hewanA; // hewanB menunjuk ke object YANG SAMA

        System.out.println("Nama hewanA : " + hewanA.nama);
        System.out.println("Nama hewanB : " + hewanB.nama);

        // Ubah nama lewat hewanB
        hewanB.nama = "Raja II";

        System.out.println("\nSetelah hewanB.nama diubah:");
        System.out.println("Nama hewanA : " + hewanA.nama); // ikut berubah!
        System.out.println("Nama hewanB : " + hewanB.nama);

        System.out.println("\n=== NULL & GARBAGE COLLECTOR ===");

        HewanConstructor hewanTemp = new HewanConstructor("Koko", "Koala", 2);
        System.out.println(hewanTemp.nama + " dibuat di Heap.");

        // Memutus referensi → object siap dihapus GC
        hewanTemp = null;
        System.out.println("hewanTemp diset null.");

        // Cek null sebelum dipakai!
        if (hewanTemp == null) {
            System.out.println("hewanTemp sudah null, tidak bisa dipakai!");
        } 

        // Minta Garbage Collector bekerja
        System.gc();
        System.out.println("Garbage Collector dipanggil!");
            }
   
}

