package Material;

import java.util.Scanner;

public class Method {
    static Scanner input = new Scanner(System.in);

    static void nama(String name) {
        System.out.println("Halo nama saya " + name);
    }

    static void umur(int age) {
        System.out.println("Umur saya adalah " + age);
    }

    static void asal(String domicile) {
        System.out.println("Saya asal dari " + domicile);
    }

    static void p() {
        System.out.println();
    }

    static int tambah(int x, int y) {
        return x + y;
    }

    static int perkalian(int x, int y) {
        return x * y;
    }

    static int doubles(int x) {
        return x * 2;
    }

    static int accum(int x) {
        if (x > 0) {
            return x + accum(x - 1);
        } else {
            return 0;
        }
    }

    static int fak(int x) {
        if (x > 0) {
            return x * fak(x - 1);
        } else {
            return 1;
        }
    }

    static void countdown(int x) {

        if (x > 0) {
            System.out.print(x + " ");
            countdown(x - 1);
        }
    }

    public static void main(String[] args) {
        nama("Arfa");
        umur(18);
        asal("Jakarta");
        p();
        for (int i = 1; i <= 5; i++) {
            System.out.println(doubles(i));
        }
        p();
        System.out.println(accum(10));
        System.out.println(fak(0));

        p();
        countdown(5);

    }
}
