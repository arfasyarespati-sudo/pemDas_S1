import java.util.Scanner;

public class PadangMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        NasiPadang();

        boolean menu = true;
        int total = 0;

        while (menu) {
            System.out.print("Pilih menu: ");
            int menu_1 = input.nextInt();

            total = Perhitungan(menu_1, total);

            if (menu_1 == 0) {
                menu = false;
                System.out.print("Total pembelian: " + total);
            }
            if (menu_1 >= 4)
                System.out.println("TIDAK VALID...");
            if (menu_1 < 0)
                System.out.println("TIDAK VALID...");

        }
        input.close();
    }

    public static void NasiPadang() {
        System.out.println("(1).Rendang       : Rp.7000 ");
        System.out.println("(2).Ayam Gulai    : Rp.9000");
        System.out.println("(3).Telur Barendo : Rp.6000");
        System.out.println("(0).Selesai Pemesanan");
    }

    public static int Perhitungan(int menu_1, int total) {

        if (menu_1 == 1) {
            total += 7000;
        }
        if (menu_1 == 2) {
            total += 9000;
        }
        if (menu_1 == 3) {
            total += 6000;
        }
        return total;
    }
}
