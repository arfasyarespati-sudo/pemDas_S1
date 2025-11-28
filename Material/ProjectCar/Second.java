package Material.ProjectCar;

public class Second {
    // Deklarasi Variabel yang akan digunakan
    String loko;
    int pintu;
    String merk;
    String smerk;
    String bagasi;
    int v;
    int thn;

    // Inisiasi Atribut dan logika
    public Second(String loko) {
        this.loko = loko;

        if (loko.equals("Mobil")) {
            this.pintu = 4;
            this.merk = "Toyota Avanza";
            this.smerk = "Avanza";
            this.thn = 2020;
            this.v = 60;
        } else if (loko.equals("Motor")) {
            this.bagasi = "Ada";
            this.merk = "Honda Vario";
            this.smerk = "Vario";
            this.thn = 2023;
            this.v = 30;
        } else {
            System.out.println("Tidak ditemukan");
        }
    }

    // Tampilan di output (Mobil) saat running.
    void infomobil() {

        System.out.println();
        System.out.println("== " + "MOBIL" + " ==");
        System.out.println(this.loko + " " + this.merk + " dihidupkan.");
        System.out.println("Merk: " + this.merk + " | " + "Tahun: " + this.thn);
        System.out.println("Pintu: " + this.pintu + " | " + "Kecepatan: " + this.v + " km/jam.");
    }

    // Tampilan di output (Motor) saat running.
    void infomotor() {

        System.out.println();
        System.out.println("== " + "MOTOR" + " ==");
        System.out.println(this.loko + " " + this.merk + " dihidupkan.");
        System.out.println("Merk: " + this.merk + " | " + "Tahun: " + this.thn);
        System.out.println("Bagasi: " + this.bagasi + " | " + "Kecepatan: " + this.v + " km/jam.");
    }

    // Tampilan di output (Akses Langsung) saat running.
    void access() {
        System.out.println("--- Akses Langsung ---");
        System.out.println(this.smerk + " Tahun Produksi: " + this.thn);
        System.out.println();
    }

   
}
