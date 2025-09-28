import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean kondisi = true;
        double hasil = 0;

        while (kondisi) {
            int operator = input.nextInt();

            if (operator == 0) {
                System.out.println("Hasil akhir: " + hasil);
                System.out.println("Kalkulator dimatikan");
                kondisi = false;
            }

            else if (operator > 4) {
                System.out.println("Opsi tidak ditemukan");
                continue;
            }

            else if (operator < 0) {
                System.out.println("Opsi tidak ditemukan");
                continue;
            }

            else {
                double hasil2 = input.nextDouble();
                if (operator == 1) {
                    hasil = hasil + hasil2;
                } else if (operator == 2) {
                    hasil = hasil - hasil2;
                } else if (operator == 3) {
                    hasil = hasil * hasil2;
                } else if (operator == 4) {
                    if (hasil2 == 0) {
                        continue;
                    }
                    hasil = hasil / hasil2;
                }
            }

        }

        input.close();
    }
}