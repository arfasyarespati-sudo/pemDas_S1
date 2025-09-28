import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean nilaiawal = true;
        while (nilaiawal) {

            double bilangan1 = 0;
            double bilangan2 = 0;
            double bilangan3 = 0;

            boolean menu = true;
            while (menu) {

                System.out.println("Menu");
                System.out.println("1 = penjumlahan");
                System.out.println("2 = pengurangan");
                System.out.println("3 = perkalian");
                System.out.println("4 = pembagian");
                System.out.println("0 = keluar program");
                int operator = input.nextInt();

                if (operator < 0) {
                    System.out.println("Opsi tidak ditemukan");
                    continue;
                }
                if (operator > 4) {
                    System.out.println("Opsi tidak ditemukan");
                    continue;
                }

                if (operator == 1) {
                    bilangan1 = input.nextDouble();
                    bilangan2 = input.nextDouble();
                    bilangan3 = bilangan1 += bilangan2;
                }
                if (operator == 2) {
                    bilangan1 = input.nextDouble();
                    bilangan2 = input.nextDouble();
                    bilangan3 = bilangan1 -= bilangan2;
                }
                if (operator == 3) {
                    bilangan1 = input.nextDouble();
                    bilangan2 = input.nextDouble();
                    bilangan3 = bilangan1 *= bilangan2;
                }
                if (operator == 4) {
                    bilangan1 = input.nextDouble();
                    bilangan2 = input.nextDouble();
                    bilangan3 = bilangan1 /= bilangan2;
                }

                else if (operator == 0) {
                    nilaiawal = false;
                    menu = false;
                    double hasil = bilangan3;
                    System.out.println("Hasil akhir: " + hasil);
                    System.out.println("Kalkulator dimatikan");

                }

            }
        }

        input.close();
    }
}
