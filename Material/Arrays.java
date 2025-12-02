package Material;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] brgs = { "A12", "B45", "C20", "A35", "D78" };

        System.out.print("Masukkan kode barang: ");
        String put = input.nextLine();
        String[] arrputs = put.split(" ");

        for (String arrput : arrputs) {
            boolean ditemukan = false;
            for (String brg : brgs) {
                if (arrput.equals(brg)) {
                    ditemukan = true;
                    break;
                }

                if (ditemukan) {
                    System.out.println(brg + " : " + "Kode ditemukan.");
                } else {
                    System.out.println(brg + " : Kode tidak ditemukan.");
                }
            }
        }

        input.close();
    }
}
