package Material;

import java.util.Scanner;

public class Method {
    static Scanner input = new Scanner(System.in);

    static void umur() {
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Kamu sudah dewasa..");
        } else if (age < 18 && age >= 12) {
            System.out.println("Kamu sudah remaja");
        } else if (age < 12 && age >= 5) {
            System.out.println("Kamu belum remaja");
        } else if (age < 5) {
            System.out.println("kamu balita");
        } else
            System.out.println("lu ap jir");
    }

    static void p() {
        System.out.println("");
    }

    static void ask() {
        System.out.println("Berapa umurnya: ");
    }

    public static void main(String[] args) {
        ask();
        umur();
        p();
        ask();
        umur();
        p();

    }
}
