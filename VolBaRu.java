import java.util.Scanner;

public class VolBaRu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean menu = true;
        while (menu) {

            System.out.println("Menu");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.println();
            System.out.print("MASUKKAN PILIHAN ANDA: ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("KELUAR!!!");
                System.exit(0);
            }

            System.out.println("Masukkan a: ");
            int a = input.nextInt();
            System.out.println("Masukkan t: ");
            int t = input.nextInt();
            System.out.println("Masukkan r: ");
            int r = input.nextInt();

            if (pilihan == 1) {
                int hasil = a * t * r;
                System.out.println("hasilnya adalah: " + hasil);
            }
            if (pilihan == 2) {
                double hasil = 1.33 * 3.14 * r * r * r;
                System.out.println("hasilnya adalah: " + hasil);
            }
            if (pilihan == 3) {
                double hasil = 0.33 * 3.14 * r * r * t;
                System.out.println("hasilnya adalah: " + hasil);
            }
            if (pilihan == 4) {
                double hasil = t * 3.14 * r * r;
                System.out.println("hasilnya adalah: " + hasil);
            }
            if (pilihan == 5) {
                double hasil = 0.33 * (0.5 * a * t) * r;
                System.out.println("hasilnya adalah: " + hasil);
            }

            System.out.println("Tutup kalkulator? (y/n): ");
            char lagi = input.next().charAt(0);
            if (lagi == 'y' || lagi == 'Y') {
                menu = false;
                System.out.println("Kalkulator ditutup...");
            }

        }

        input.close();

    }

}
