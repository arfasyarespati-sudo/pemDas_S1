import java.util.Scanner;

public class Tutut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] harga = { 50000, 100000, 200000, 300000 };
        String[] jenis = { "Ekonomi", "Bisnis", "Eksekutif", "Pariwisata" };
        int[] diskon = { 2, 5, 7, 10 };
        String[] ac = { "Tidak ada", "Ada", "Ada", "Ada" };
        String[] colokan = { "Tidak ada", "Tidak ada", "Tidak ada", "Ada" };

        double[] totalPesanan = new double[1000];
        int jumlah = 0;
        String[] jenisPesanan = new String[1000];
        int[] jumlahPesanan = new int[1000];

        boolean valid = true;
        while (valid) {
            System.out.println("========================================");
            System.out.println("      PEMESANAN TIKET KERETA API");
            System.out.println("========================================");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan nilai: ");
            int pilihan = in.nextInt();

            switch (pilihan) {

                case 0:
                    System.out.println("=============================================================");
                    System.out.println("Program selesai, terimakasih telah memakai jasa layanan kami!!");
                    System.out.println("=============================================================");
                    valid = false;
                    break;

                case 1:
                    System.out.println("Daftar kereta api saat ini: ");
                    System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        System.out.printf("\n%-15s %-12d %-10s %-12s %12s\n", jenis[i], harga[i], diskon[i], ac[i],
                                colokan[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        if (ac[i].equals("Ada")) {
                            System.out.printf("\n%-15s %-12d %-10s %-12s %12s\n", jenis[i], harga[i], diskon[i], ac[i],
                                    colokan[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.printf("%-15s %-12s %-10s %-10s %10s", "Jenis", "Harga", "Diskon(%)", "AC", "Colokan");
                    for (int i = 0; i < jenis.length; i++) {
                        if (colokan[i].equals("Ada")) {
                            System.out.printf("\n%-15s %-12d %-10s %-12s %12s\n", jenis[i], harga[i], diskon[i], ac[i],
                                    colokan[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Pilih kereta api (1-4): ");
                    int milih = in.nextInt();

                    if (milih < 1 || milih > jenis.length) {
                        System.out.println("Nomor Kereta tidak valid");
                        break;
                    }
                    System.out.print("Jumlah tiket?: ");
                    int jumlahTiket = in.nextInt();

                    if (jumlahTiket <= 0) {
                        System.out.println("Tidak melakukan pembelian");
                    }

                    int ind = milih - 1;

                    double totalSebelumDiskon = harga[ind] * jumlahTiket;
                    double potongan = totalSebelumDiskon * diskon[ind] / 100;
                    double totalAkhir = totalSebelumDiskon - potongan;

                    jenisPesanan[jumlah] = jenis[ind];
                    jumlahPesanan[jumlah] = jumlahTiket;
                    totalPesanan[jumlah] = totalAkhir;
                    jumlah++;

                    System.out.println("    DETAIL PESANAN     ");
                    System.out.println("Jenis kereta: " + jenis[ind]);
                    System.out.println("Jumlah tiket: " + jumlahTiket);
                    System.out.println("Harga per tiket: " + "Rp " + harga[ind]);
                    System.out.println("Subtotal       : " + "Rp " + (int) totalSebelumDiskon);
                    System.out.println("Diskon         : " + diskon[ind] + "%");
                    System.out.println("Total Bayar    : " + "Rp " + (int) totalAkhir);
                    break;

                case 5:
                    if (jumlah == 0) {
                        System.out.println("Tidak ada pesanan");
                    } else {
                        System.out.printf("%-10s %-10s %-10s %-10s\n", "No", "Jenis Kereta", "Jumlah", "Total Harga");

                        double totalSemuaPesanan = 0;
                        for (int i = 0; i < jumlah; i++) {
                            System.out.printf("%-10d %-10s %-10d %-10d\n",
                                    (i + 1), jenisPesanan[i], jumlahPesanan[i], (int) totalPesanan[i]);

                            totalSemuaPesanan += totalPesanan[i];
                        }
                        System.out.println("Total semua pesanan: " + (int) totalSemuaPesanan);
                    }
                    break;

                default:
                    System.out.println("Kode invalid, menu berhenti...");
                    return;
            }
        }
        in.close();
    }
}
