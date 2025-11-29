package Material;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] brg = { "A12", "B45", "C20", "A35", "D78" };

        System.out.print("Masukkan kode barang: ");
        String put = input.nextLine();
        String[] arrput = put.split(" ");
        boolean ditemukan = false;

        for (String space : arrput) {

            for (String barang : brg) {
                if (space.equals(barang)) {
                    ditemukan = true;
                    break;
                }
                if (ditemukan) {
                    System.out.println(barang + " : " + "Kode ditemukan.");
                } else {
                    System.out.println(barang + " : Kode tidak ditemukan.");
                }
            }
        }

        input.close();
    }
}
