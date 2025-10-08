import java.util.Scanner;

public class TokoPemdas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] buah = { "apel", "markisa", "jeruk", "mangga" };
        String[] stok = { "10", "20", "15", "5" };
        String[] harga = { "12000", "13000", "9000", "15000" };

        String[][] a = new String[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0) {
                    a[i][j] = buah[j];
                } else if (i == 1) {
                    a[i][j] = stok[j];
                } else {
                    a[i][j] = harga[j];
                }
            }
        }

        System.out.println("=== DATA TOKO BUAH ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("UBAH STOK: ");
        System.out.print("Pilih buah (0/1/2/3): ");
        int pilihan = in.nextInt();

        System.out.print("Masukkan stok baru: ");
        int stokBaru = in.nextInt();

        a[1][pilihan] = String.valueOf(stokBaru);
        stok[pilihan] = String.valueOf(stokBaru);

        System.out.println("Stok diubah..");

        System.out.println("DATA SETELAH DIUBAH: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int minStok = Integer.parseInt(stok[0]);
        int indexMin = 0;

        for (int j = 1; j < 4; j++) {
            int currentStok = Integer.parseInt(stok[j]);
            if (currentStok < minStok) {
                minStok = currentStok;
                indexMin = j;
            }
        }

        System.out.println("STOK PALING KECIL :");
        System.out.println("Buah: " + buah[indexMin]);
        System.out.println("Stok: " + minStok);
        System.out.println("Harga: Rp " + harga[indexMin]);

        in.close();
    }
}