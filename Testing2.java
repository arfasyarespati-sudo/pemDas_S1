import java.util.Scanner;

public class Testing2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, jumlah;
        int harga, subtotal, totalAwal, totalSetelahDiskon, totalAkhir;
        int diskonBelanja, diskonSpesial, biayaBungkus, pajak;
        int beliAyamBakarMadu;
        String tambahItem, bungkus, hari, lanjut;

        System.out.print("Apakah ingin memulai transaksi? (y/n): ");
        lanjut = input.next();

        while (lanjut.equalsIgnoreCase("y")) {
            // Reset nilai setiap transaksi
            totalAwal = 0;
            totalSetelahDiskon = 0;
            totalAkhir = 0;
            diskonBelanja = 0;
            diskonSpesial = 0;
            biayaBungkus = 0;
            pajak = 0;
            beliAyamBakarMadu = 0;

            System.out.println("=== Warung Makan Nusantara ===");
            System.out.println("Menu:");
            System.out.println("1. Nasi Goreng Spesial  - Rp15.000");
            System.out.println("2. Ayam Bakar Madu      - Rp25.000");
            System.out.println("3. Soto Ayam Lamongan   - Rp12.000");
            System.out.println("4. Es Teh Manis         - Rp5.000");
            System.out.println("5. Es Jeruk             - Rp7.000");

            System.out.print("Apakah ingin menambah item? (y/n): ");
            tambahItem = input.next();

            while (tambahItem.equalsIgnoreCase("y")) {
                System.out.print("Masukkan kode menu (1-5): ");
                pilihan = input.nextInt();
                System.out.print("Masukkan jumlah: ");
                jumlah = input.nextInt();

                // Hitung subtotal
                harga = 0;
                String nama = "";
                if (pilihan == 1) {
                    harga = 15000;
                    nama = "Nasi Goreng Spesial";
                    biayaBungkus += 2000;
                } else if (pilihan == 2) {
                    harga = 25000;
                    nama = "Ayam Bakar Madu";
                    beliAyamBakarMadu += jumlah;
                    biayaBungkus += 2000;
                } else if (pilihan == 3) {
                    harga = 12000;
                    nama = "Soto Ayam Lamongan";
                    biayaBungkus += 2000;
                } else if (pilihan == 4) {
                    harga = 5000;
                    nama = "Es Teh Manis";
                } else if (pilihan == 5) {
                    harga = 7000;
                    nama = "Es Jeruk";
                } else {
                    System.out.println("Kode menu tidak valid!");
                }

                subtotal = harga * jumlah;
                totalAwal += subtotal;

                System.out.println(jumlah + " x " + nama + " = Rp" + subtotal);

                System.out.print("Tambah item lagi? (y/n): ");
                tambahItem = input.next();
            }

            // Diskon belanja
            if (totalAwal > 100000) {
                diskonBelanja = (int) (0.15 * totalAwal);
            } else if (totalAwal > 50000) {
                diskonBelanja = (int) (0.10 * totalAwal);
            }

            totalSetelahDiskon = totalAwal - diskonBelanja;

            // Diskon spesial hari Jumat
            System.out.print("Hari ini hari apa? ");
            hari = input.next();
            if (hari.equalsIgnoreCase("Jumat") && beliAyamBakarMadu > 0) {
                diskonSpesial = 5000;
                totalSetelahDiskon -= diskonSpesial;
            }

            // Bungkus atau makan di tempat
            System.out.print("Apakah pesanan dibungkus? (y/n): ");
            bungkus = input.next();
            if (bungkus.equalsIgnoreCase("y")) {
                totalSetelahDiskon += biayaBungkus;
            } else {
                biayaBungkus = 0;
            }

            // Pajak 10%
            pajak = (int) (0.10 * totalSetelahDiskon);
            totalAkhir = totalSetelahDiskon + pajak;

            // Cetak struk
            System.out.println("\n=== STRUK BELANJA ===");
            System.out.println("Total Awal: Rp" + totalAwal);
            if (diskonBelanja > 0) {
                System.out.println("Diskon Belanja: -Rp" + diskonBelanja);
            }
            if (diskonSpesial > 0) {
                System.out.println("Diskon Spesial Jumat: -Rp" + diskonSpesial);
            }
            if (biayaBungkus > 0) {
                System.out.println("Biaya Bungkus: +Rp" + biayaBungkus);
            }
            System.out.println("Subtotal: Rp" + totalSetelahDiskon);
            System.out.println("Pajak 10%: Rp" + pajak);
            System.out.println("TOTAL BAYAR: Rp" + totalAkhir);
            System.out.println("======================\n");

            System.out.print("Apakah ingin transaksi lagi? (y/n): ");
            lanjut = input.next();
        }

        System.out.println("=== Terima kasih telah menggunakan Kasir Digital Warung Makan Nusantara ===");
        input.close();

    }

}
