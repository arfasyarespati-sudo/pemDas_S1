package Material;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String array1[] = { "ayam", "kambing", "sapi", "domba" };
        // String array2[] = { "daihatsu", "toyota", "honda", "mitsubishi" };
        // String array3[] = { "teh", "kopi", "susu", "wine" };

        // System.out.println(array1[1]);
        // System.out.println(array2[2]);
        // System.out.println(array3[3]);
        // System.out.println("berapa length");
        // int a = in.nextInt();

        // String[] daftarKaryawan = new String[a];

        // for (int i = 0; i < daftarKaryawan.length; i++) {
        // System.out.println("Masukkan Daftar Karyawan: ");
        // daftarKaryawan[i] = in.next;

        // }
        System.out.println("Masukkan berapa length");
        int a = in.nextInt();

        String[] daftarBuah = new String[a];

        System.out.println("Masukkan " + daftarBuah.length + " nama buah:");

        for (int i = 0; i < daftarBuah.length; i++) {
            System.out.print("Masukkan buah: ");
            daftarBuah[i] = in.next();
        }

        System.out.println("\n--- Daftar Buah yang Tersimpan ---");

        for (String buah : daftarBuah)
            System.out.println("- " + buah);
        System.out.println("------------------------------------");
        System.out.println();

        System.out.print("Pilih buah untuk dimakan: ");

        String buaks = in.nextLine();

        if (buaks == daftarBuah[0])
            System.out.println(daftarBuah[0]);
        if (buaks == daftarBuah[1])
            System.out.println(daftarBuah[1]);
        else if (buaks == daftarBuah[2])
            System.out.println(daftarBuah[2]);

        in.close();

    }
}
