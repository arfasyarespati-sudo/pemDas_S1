package Material;

import java.util.*;

public class Bingo {
    private static final int UKURAN = 5;
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== SELAMAT DATANG DI PERMAINAN BINGO ===\n");

        // Buat kartu bingo untuk pemain
        int[][] kartuBingo = buatKartuBingo();
        boolean[][] tandai = new boolean[UKURAN][UKURAN];

        // Tandai posisi tengah sebagai "FREE"
        tandai[2][2] = true;

        // Array untuk menyimpan nomor yang sudah dipanggil
        ArrayList<Integer> nomorDipanggil = new ArrayList<>();

        System.out.println("Kartu Bingo Anda:");
        tampilkanKartu(kartuBingo, tandai);

        boolean menang = false;
        int putaran = 0;

        while (!menang) {
            System.out.println("\n--- Putaran " + (++putaran) + " ---");
            System.out.print("Tekan ENTER untuk memanggil nomor berikutnya...");
            scanner.nextLine();

            // Panggil nomor acak
            int nomorBaru = panggilNomor(nomorDipanggil);
            System.out.println("\n🎲 Nomor yang dipanggil: " + nomorBaru);

            // Periksa dan tandai nomor di kartu
            boolean ditemukan = tandaiNomor(kartuBingo, tandai, nomorBaru);

            if (ditemukan) {
                System.out.println("✓ Nomor ditemukan di kartu Anda!");
            } else {
                System.out.println("✗ Nomor tidak ada di kartu Anda.");
            }

            // Tampilkan kartu
            System.out.println("\nKartu Bingo Anda:");
            tampilkanKartu(kartuBingo, tandai);

            // Periksa apakah menang
            menang = cekMenang(tandai);

            if (menang) {
                System.out.println("\n🎉🎉🎉 BINGO! ANDA MENANG! 🎉🎉🎉");
                System.out.println("Anda menyelesaikan dalam " + putaran + " putaran!");
            }

            // Tampilkan nomor yang sudah dipanggil
            System.out.println("\nNomor yang sudah dipanggil: " + nomorDipanggil);
        }

        scanner.close();
    }

    // Membuat kartu bingo 5x5 dengan nomor acak
    public static int[][] buatKartuBingo() {
        int[][] kartu = new int[UKURAN][UKURAN];

        // B: 1-15, I: 16-30, N: 31-45, G: 46-60, O: 61-75
        int[] rangeAwal = { 1, 16, 31, 46, 61 };
        int[] rangeAkhir = { 15, 30, 45, 60, 75 };

        for (int kolom = 0; kolom < UKURAN; kolom++) {
            ArrayList<Integer> tersedia = new ArrayList<>();

            // Isi daftar nomor yang tersedia untuk kolom ini
            for (int i = rangeAwal[kolom]; i <= rangeAkhir[kolom]; i++) {
                tersedia.add(i);
            }

            // Acak dan pilih 5 nomor untuk kolom ini
            Collections.shuffle(tersedia);

            for (int baris = 0; baris < UKURAN; baris++) {
                if (baris == 2 && kolom == 2) {
                    kartu[baris][kolom] = 0; // FREE space
                } else {
                    kartu[baris][kolom] = tersedia.get(baris);
                }
            }
        }

        return kartu;
    }

    // Menampilkan kartu bingo
    public static void tampilkanKartu(int[][] kartu, boolean[][] tandai) {
        System.out.println("  B    I    N    G    O");
        System.out.println("------------------------");

        for (int i = 0; i < UKURAN; i++) {
            for (int j = 0; j < UKURAN; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("[FREE]");
                } else if (tandai[i][j]) {
                    System.out.print("[XX] ");
                } else {
                    System.out.printf("%3d  ", kartu[i][j]);
                }
            }
            System.out.println();
        }
    }

    // Memanggil nomor acak yang belum dipanggil
    public static int panggilNomor(ArrayList<Integer> sudahDipanggil) {
        int nomor;
        do {
            nomor = random.nextInt(75) + 1;
        } while (sudahDipanggil.contains(nomor));

        sudahDipanggil.add(nomor);
        return nomor;
    }

    // Menandai nomor di kartu jika ditemukan
    public static boolean tandaiNomor(int[][] kartu, boolean[][] tandai, int nomor) {
        for (int i = 0; i < UKURAN; i++) {
            for (int j = 0; j < UKURAN; j++) {
                if (kartu[i][j] == nomor) {
                    tandai[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    // Mengecek apakah pemain menang (ada baris, kolom, atau diagonal penuh)
    public static boolean cekMenang(boolean[][] tandai) {
        // Cek baris
        for (int i = 0; i < UKURAN; i++) {
            boolean barisLengkap = true;
            for (int j = 0; j < UKURAN; j++) {
                if (!tandai[i][j]) {
                    barisLengkap = false;
                    break;
                }
            }
            if (barisLengkap)
                return true;
        }

        // Cek kolom
        for (int j = 0; j < UKURAN; j++) {
            boolean kolomLengkap = true;
            for (int i = 0; i < UKURAN; i++) {
                if (!tandai[i][j]) {
                    kolomLengkap = false;
                    break;
                }
            }
            if (kolomLengkap)
                return true;
        }

        // Cek diagonal kiri atas ke kanan bawah
        boolean diagonal1 = true;
        for (int i = 0; i < UKURAN; i++) {
            if (!tandai[i][i]) {
                diagonal1 = false;
                break;
            }
        }
        if (diagonal1)
            return true;

        // Cek diagonal kanan atas ke kiri bawah
        boolean diagonal2 = true;
        for (int i = 0; i < UKURAN; i++) {
            if (!tandai[i][UKURAN - 1 - i]) {
                diagonal2 = false;
                break;
            }
        }
        if (diagonal2)
            return true;

        return false;
    }
}