import java.util.Scanner;

public class CasedBased {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean lanjut = true;

        while (lanjut) {
            int totalBelanja = 0;
            String struk = "";

            boolean tambah = true;
            int totalMakanan = 0;
            int totalAyamBakar = 0;

            while (tambah) {
                System.out.println("===== WARUNG MAKAN NUSANTARA =====");
                System.out.println("============== MENU =============");
                System.out.println("1. Nasi Goreng Spesial = Rp 15.000");
                System.out.println("2. Ayam Bakar Madu     = Rp 25.000");
                System.out.println("3. Soto Ayam Lamongan  = Rp 12.000");
                System.out.println("4. Es Teh Manis        = Rp  5.000");
                System.out.println("5. Es Jeruk            = Rp  7.000");

                System.out.print("Masukkan kode menu (1-5): ");
                int kode = input.nextInt();
                System.out.print("Jumlah: ");
                int jumlah = input.nextInt();

                String item = "";
                int harga = 0;

                if (kode == 1) {
                    item = "Nasi Goreng Spesial";
                    harga = 15000;
                    totalMakanan += jumlah;
                } else if (kode == 2) {
                    item = "Ayam Bakar Madu";
                    harga = 25000;
                    totalMakanan += jumlah;
                    totalAyamBakar += jumlah;
                } else if (kode == 3) {
                    item = "Soto Ayam Lamongan";
                    harga = 12000;
                    totalMakanan += jumlah;
                } else if (kode == 4) {
                    item = "Es Teh Manis";
                    harga = 5000;
                } else if (kode == 5) {
                    item = "Es Jeruk";
                    harga = 7000;
                } else {
                    System.out.println("Kode kamu tidak valid!!");
                    continue;
                }

                int subtotal = harga * jumlah;
                totalBelanja += subtotal;

                struk += item + " x" + jumlah + " = Rp" + subtotal + "\n";

                System.out.print("Mau tambah item lagi kah? (y/n): ");
                char lagi = input.next().charAt(0);
                if (lagi == 'n' || lagi == 'N') {
                    tambah = false;
                }
            }

            // diskon belanja
            double diskonBelanja = 0;
            if (totalBelanja > 100000) {
                diskonBelanja = totalBelanja * 0.15;
            } else if (totalBelanja > 50000) {
                diskonBelanja = totalBelanja * 0.1;
            }

            // diskon jumat
            System.out.print("Apakah hari ini Jumat? (y/n): ");
            String hari = input.next();
            double diskonJumat = 0;
            if (hari.equalsIgnoreCase("y") && totalAyamBakar > 0) {
                diskonJumat = 5000;
            }

            // biaya bungkus
            System.out.print("Apakah pesanan dibungkus? (y/n): ");
            String bungkus = input.next();
            int biayaBungkus = 0;
            if (bungkus.equalsIgnoreCase("y")) {
                biayaBungkus = 2000 * totalMakanan;
            }

            // total
            double totalSetelahDiskon = totalBelanja - diskonBelanja - diskonJumat;
            double totalSetelahTambahan = totalSetelahDiskon + biayaBungkus;
            double pajak = 0.1 * totalSetelahTambahan;
            double totalAkhir = totalSetelahTambahan + pajak;

            // cetak struk
            System.out.println(" ");
            System.out.println("=========== STRUK PEMBAYARAN ===========");
            System.out.print(struk);
            System.out.println("----------------------------------------");
            System.out.printf("Total Awal      : Rp %.0f\n", (double) totalBelanja);
            System.out.printf("Diskon Belanja  : Rp %.0f\n", diskonBelanja);
            System.out.printf("Diskon Jumat    : Rp %.0f\n", diskonJumat);
            System.out.printf("Biaya Bungkus   : Rp %.0f\n", (double) biayaBungkus);
            System.out.printf("Subtotal        : Rp %.0f\n", totalSetelahTambahan);
            System.out.printf("Pajak 10%%       : Rp %.0f\n", pajak);
            System.out.println("----------------------------------------");
            System.out.printf("TOTAL BAYAR     : Rp %.0f\n", totalAkhir);
            System.out.println("========================================");

            System.out.print("\nTransaksi lagi? (y/n): ");
            char lagi = input.next().charAt(0);
            if (lagi == 'n' || lagi == 'N') {
                lanjut = false;
            }
        }

        input.close();
    }
}