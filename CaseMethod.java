import java.util.Scanner;

public class CaseMethod {

    static Scanner input = new Scanner(System.in);

    // ==================== METHOD TAMPILKAN MENU ====================
    static void tampilkanMenu() {
        System.out.println("\n===== WARUNG MAKAN NUSANTARA =====");
        System.out.println("============== MENU =============");
        System.out.println("1. Nasi Goreng Spesial = Rp 15.000");
        System.out.println("2. Ayam Bakar Madu     = Rp 25.000");
        System.out.println("3. Soto Ayam Lamongan  = Rp 12.000");
        System.out.println("4. Es Teh Manis        = Rp  5.000");
        System.out.println("5. Es Jeruk            = Rp  7.000");
    }

    // ==================== METHOD NAMA MENU ====================
    static String getNamaMenu(int kode) {
        switch (kode) {
            case 1:
                return "Nasi Goreng Spesial";
            case 2:
                return "Ayam Bakar Madu";
            case 3:
                return "Soto Ayam Lamongan";
            case 4:
                return "Es Teh Manis";
            case 5:
                return "Es Jeruk";
            default:
                return "Tidak Valid";
        }
    }

    // ==================== METHOD HARGA MENU ====================
    static int getHargaMenu(int kode) {
        switch (kode) {
            case 1:
                return 15000;
            case 2:
                return 25000;
            case 3:
                return 12000;
            case 4:
                return 5000;
            case 5:
                return 7000;
            default:
                return 0;
        }
    }

    // ==================== METHOD DISKON BELANJA ====================
    static double hitungDiskonBelanja(double totalBelanja) {
        if (totalBelanja > 100000) {
            return totalBelanja * 0.15;
        } else if (totalBelanja > 50000) {
            return totalBelanja * 0.1;
        }
        return 0;
    }

    // ==================== METHOD DISKON JUMAT ====================
    static double hitungDiskonJumat(int totalAyamBakar) {
        System.out.print("Apakah hari ini Jumat? (y/n): ");
        String hari = input.next();

        if (hari.equalsIgnoreCase("y") && totalAyamBakar > 0) {
            return 5000;
        }
        return 0;
    }

    // ==================== METHOD BIAYA BUNGKUS ====================
    static int hitungBiayaBungkus(int totalMakanan) {
        System.out.print("Apakah pesanan dibungkus? (y/n): ");
        String bungkus = input.next();

        if (bungkus.equalsIgnoreCase("y")) {
            return 2000 * totalMakanan;
        }
        return 0;
    }

    // ==================== METHOD INPUT PESANAN ====================
    static int prosesPesanan(StringBuilder struk, int[] dataTambahan) {
        int totalBelanja = 0;
        boolean tambah = true;

        while (tambah) {
            tampilkanMenu();

            System.out.print("Masukkan kode menu (1-5): ");
            int kode = input.nextInt();
            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            String item = getNamaMenu(kode);
            int harga = getHargaMenu(kode);

            if (harga == 0) {
                System.out.println("Kode menu tidak valid!");
                continue;
            }

            int subtotal = harga * jumlah;
            totalBelanja += subtotal;
            struk.append(item)
                    .append(" x").append(jumlah)
                    .append(" = Rp").append(subtotal)
                    .append("\n");

            // Data tambahan: [0] = total makanan, [1] = total ayam bakar
            if (kode <= 3)
                dataTambahan[0] += jumlah;
            if (kode == 2)
                dataTambahan[1] += jumlah;

            System.out.print("Tambah item lagi? (y/n): ");
            char lagi = input.next().charAt(0);
            tambah = !(lagi == 'n' || lagi == 'N');
        }

        return totalBelanja;
    }

    // ==================== METHOD CETAK STRUK ====================
    static void cetakStruk(String struk, double totalBelanja, double diskonBelanja,
            double diskonJumat, double biayaBungkus) {

        double totalSetelahDiskon = totalBelanja - diskonBelanja - diskonJumat;
        double totalSetelahTambahan = totalSetelahDiskon + biayaBungkus;
        double pajak = 0.1 * totalSetelahTambahan;
        double totalAkhir = totalSetelahTambahan + pajak;

        System.out.println("\n=========== STRUK PEMBAYARAN ===========");
        System.out.print(struk);
        System.out.println("----------------------------------------");
        System.out.printf("Total Awal      : Rp %.0f\n", totalBelanja);
        System.out.printf("Diskon Belanja  : Rp %.0f\n", diskonBelanja);
        System.out.printf("Diskon Jumat    : Rp %.0f\n", diskonJumat);
        System.out.printf("Biaya Bungkus   : Rp %.0f\n", biayaBungkus);
        System.out.printf("Subtotal        : Rp %.0f\n", totalSetelahTambahan);
        System.out.printf("Pajak 10%%       : Rp %.0f\n", pajak);
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL BAYAR     : Rp %.0f\n", totalAkhir);
        System.out.println("========================================");
    }

    // ==================== MAIN METHOD ====================
    public static void main(String[] args) {
        boolean lanjut = true;

        while (lanjut) {
            StringBuilder struk = new StringBuilder();
            int[] dataTambahan = new int[2]; // [0] total makanan, [1] total ayam bakar

            int totalBelanja = prosesPesanan(struk, dataTambahan);
            double diskonBelanja = hitungDiskonBelanja(totalBelanja);
            double diskonJumat = hitungDiskonJumat(dataTambahan[1]);
            int biayaBungkus = hitungBiayaBungkus(dataTambahan[0]);

            cetakStruk(struk.toString(), totalBelanja, diskonBelanja, diskonJumat, biayaBungkus);

            System.out.print("\nTransaksi lagi? (y/n): ");
            char lagi = input.next().charAt(0);
            lanjut = !(lagi == 'n' || lagi == 'N');
        }

        input.close();
        System.out.println("Terima kasih telah berbelanja!");
    }
}
