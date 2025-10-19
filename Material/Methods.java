package Material;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * int a = in.nextInt();
         * int b = in.nextInt();
         * String angka = ("Selamat pagi!!");
         * 
         * method(a, b, angka);
         * 
         * in.close();
         * }
         * 
         * public static void method(int a, int b, String angka) {
         * int c = a * b;
         * System.out.println(c);
         * System.out.println(angka);
         */

        HBD();
        HBD();
        HBD();

        int a = input.nextInt();
        int b = input.nextInt();

        Pertambahan(a, b);

    }

    public static void HBD() {
        System.out.println("Selamat ulang tahun..");
        System.out.println("Semoga panjang umur");
        System.out.println("Selamat ulang tahun..");
        System.out.println("Potong kuenya..\n");

    }

    public static void Pertambahan(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }
}
