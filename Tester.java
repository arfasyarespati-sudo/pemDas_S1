import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        int id = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Variabel hasil
        StringBuilder pesan = new StringBuilder(); // Menyimpan pesan hasil dekripsi
        StringBuilder invalid = new StringBuilder(); // Menyimpan angka invalid

        // Proses dekripsi
        for (int i = 0; i < n; i++) {
            int angka = arr[i];

            if (angka >= id && angka <= id + 25) {
                // Huruf A–Z
                char huruf = (char) ('A' + (angka - id));
                pesan.append(huruf);
            } else if (angka == id + 26) {
                // Spasi
                pesan.append(" ");
            } else {
                // Tambahkan angka invalid dengan koma jika bukan yang pertama
                if (invalid.length() > 0) {
                    invalid.append(", ");
                }
                invalid.append(angka);
            }
        }

        // Output hasil
        System.out.println("Output pesan: " + pesan.toString());
        if (invalid.length() > 0) {
            System.out.println("Elemen tidak valid ditemukan: " + invalid.toString());
        } else {
            System.out.println("Elemen tidak valid ditemukan: Tidak ada");
        }

        sc.close();
    }
}
