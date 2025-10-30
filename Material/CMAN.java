package Material;

import java.util.*;

public class CMAN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // jumlah baris
        int m = input.nextInt(); // jumlah kolom
        boolean[][] kursi = new boolean[n][m];

        // inisialisasi array kursi
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                kursi[i][j] = input.nextBoolean();
            }
        }

        int q = input.nextInt(); // jumlah perintah
        input.nextLine(); // hapus newline
        int harga = -1; // -1 artinya harga belum ditetapkan

        for (int k = 0; k < q; k++) {
            String perintah = input.next();

            switch (perintah) {
                case "CEK_KURSI":
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print((kursi[i][j] ? "X" : "O") + (j == m - 1 ? "" : " "));
                        }
                        System.out.println();
                    }
                    break;

                case "SETHARGA":
                    harga = input.nextInt();
                    System.out.println("Harga kursi diubah menjadi " + harga + ".");
                    break;

                case "PESAN":
                    int r = input.nextInt() - 1;
                    int c = input.nextInt() - 1;

                    if (kursi[r][c]) {
                        System.out
                                .println("Kursi baris " + (r + 1) + " kolom " + (c + 1) + " sudah dipesan sebelumnya!");
                    } else {
                        kursi[r][c] = true;
                        System.out.println("Kursi baris " + (r + 1) + " kolom " + (c + 1) + " berhasil dipesan.");
                    }
                    break;

                case "HITUNG_PENDAPATAN":
                    if (harga == -1) {
                        System.out.println("Harga kursi belum ditetapkan!");
                    } else {
                        int totalPesan = 0;
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                if (kursi[i][j])
                                    totalPesan++;
                            }
                        }
                        System.out.println("Pendapatan: " + (totalPesan * harga));
                    }
                    break;

                case "KOSONGKAN":
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            kursi[i][j] = false;
                        }
                    }
                    System.out.println("Semua kursi telah dikosongkan.");
                    break;

                default:
                    System.out.println("Perintah tidak dikenal: " + perintah);
            }
        }
    }
}
