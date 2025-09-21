
// Impor kelas Scanner untuk membaca input dari pengguna
import java.util.Scanner;

public class VenMac {
    public static void main(String[] args) {

        // 1. Inisialisasi
        // Membuat objek Scanner untuk menerima input
        Scanner input = new Scanner(System.in);

        int saldo = 5000;

        // Harga item disesuaikan
        int hargaKopi = 6000;
        int hargaTeh = 5000;
        int hargaSusu = 4000;

        // 2. Tampilkan Menu kepada Pengguna
        System.out.println("=====================================");
        System.out.println("    SELAMAT DATANG DI VENDING MACHINE");
        System.out.println("=====================================");
        System.out.println("Saldo Anda saat ini: Rp " + saldo);
        System.out.println("\n--- Pilihan Minuman ---");
        System.out.println("1. Kopi      (Rp " + hargaKopi + ")");
        System.out.println("2. Teh       (Rp " + hargaTeh + ")");
        System.out.println("3. Susu      (Rp " + hargaSusu + ")");
        System.out.println("-------------------------------------");

        // Meminta pengguna untuk memasukkan pilihan
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = input.nextInt();
        System.out.println("=====================================");

        // 3. Proses Pilihan Menggunakan Switch
        switch (pilihan) {
            // Kasus untuk Kopi (seharusnya gagal)
            case 1:
                System.out.println("Anda memilih Kopi.");
                if (saldo >= hargaKopi) {
                    saldo -= hargaKopi;
                    System.out.println("Pembelian berhasil! Silakan ambil Kopi Anda.");
                } else {
                    // Pesan ini akan muncul karena saldo (5000) < hargaKopi (6000)
                    System.out.println("Maaf, saldo Anda tidak cukup untuk membeli Kopi.");
                }
                break;

            // Kasus untuk Teh (seharusnya berhasil)
            case 2:
                System.out.println("Anda memilih Teh.");
                if (saldo >= hargaTeh) {
                    saldo -= hargaTeh;
                    System.out.println("Pembelian berhasil! Silakan ambil Teh Anda.");
                } else {
                    System.out.println("Maaf, saldo Anda tidak cukup untuk membeli Teh.");
                }
                break;

            // Kasus untuk Susu (seharusnya berhasil)
            case 3:
                System.out.println("Anda memilih Susu.");
                if (saldo >= hargaSusu) {
                    saldo -= hargaSusu;
                    System.out.println("Pembelian berhasil! Silakan ambil Susu Anda.");
                } else {
                    System.out.println("Maaf, saldo Anda tidak cukup untuk membeli Susu.");
                }
                break;

            // Kasus jika pilihan tidak valid
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih nomor yang tersedia di menu.");
                break;
        }

        // 4. Tampilkan Hasil Akhir
        System.out.println("\n-------------------------------------");
        System.out.println("Terima kasih telah bertransaksi.");
        System.out.println("Sisa saldo Anda: Rp " + saldo);
        System.out.println("-------------------------------------");

        input.close();
    }
}