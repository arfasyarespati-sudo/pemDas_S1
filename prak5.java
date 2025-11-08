import java.util.Scanner;

public class prak5 {
    static Scanner input = new Scanner(System.in);
    static int saldo = 0;
    static String riwayat = "";

    public static void menu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Lihat Saldo");
        System.out.println("2. Setor Uang");
        System.out.println("3. Tarik Uang");
        System.out.println("4. Lihat Riwayat Transaksi");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
        int ans = input.nextInt();

        switch (ans) {
            case 1:
                System.out.println("Saldo Anda saat ini: Rp" + saldo);
                break;
            case 2:
                System.out.print("Masukkan jumlah setoran: ");
                int setor = input.nextInt();
                if (setor <= 0) {
                    System.out.println("Jumlah setoran tidak valid!");
                } else {
                    saldo += setor;
                    riwayat += "Setor - Rp" + setor + "\n";
                    System.out.println("Setoran berhasil! Saldo sekarang: Rp" + saldo);
                }
                break;
            case 3:
                System.out.println("Masukkan jumlah penarikan: ");
                int tarik = input.nextInt();
                if (tarik <= 0) {
                    System.out.println("Jumlah penarikan tidak valid!");
                } else if (tarik > saldo) {
                    System.out.println("Saldo tidak cukup!");
                } else {
                    saldo -= tarik;
                    riwayat += "Tarik - Rp" + tarik + "\n";
                    System.out.println("Penarikan berhasil! Saldo sekarang: Rp" + saldo);
                }
                break;
            case 4:
                System.out.println("=== Riwayat Transaksi ===");
                if (riwayat.equals("")) {
                    System.out.println("Belum ada transaksi.");
                } else {
                    String[] arr = riwayat.split("\n");
                    for (int i = 0; i < arr.length; i++) {
                        if (!arr[i].trim().equals("")) {
                            System.out.println((i + 1) + ". " + arr[i]);
                        }
                    }
                }
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan ATM ini.");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    public static void main(String[] args) {
        do {
            menu();
        } while (true);
    }
}
