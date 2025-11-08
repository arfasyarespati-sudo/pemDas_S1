import java.util.Scanner;

public class IPKalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ips1 = input.next();
        String ips2 = input.next();
        String ips3 = input.next();
        String ips4 = input.next();
        String ips5 = input.next();

        double nilai1 = konversiNilai(ips1);
        double nilai2 = konversiNilai(ips2);
        double nilai3 = konversiNilai(ips3);
        double nilai4 = konversiNilai(ips4);
        double nilai5 = konversiNilai(ips5);

        double rata = hitungRata(nilai1, nilai2, nilai3, nilai4, nilai5);
        double min = cariMin(nilai1, nilai2, nilai3, nilai4, nilai5);
        double max = cariMax(nilai1, nilai2, nilai3, nilai4, nilai5);

        tampilkanHasil(rata, max, min);
        input.close();
    }

    static double konversiNilai(String huruf) {
        huruf = huruf.toUpperCase();
        switch (huruf) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":

                return 2.5;
            case "C":

                return 2.0;
            case "D+":

                return 1.5;
            case "D":

                return 1.0;
            case "E":
            case "K":
                return 0.0;
            default:
                System.out.print("Nilai tidak valid: " + huruf + " (dianggap 0.00)");
                return 0.0;
        }
    }

    static double hitungRata(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5.0;
    }

    static double cariMin(double a, double b, double c, double d, double e) {
        double min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        if (e < min)
            min = e;
        return min;
    }

    static double cariMax(double a, double b, double c, double d, double e) {
        double max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        if (e > max)
            max = e;
        return max;
    }

    static void tampilkanHasil(double rata, double max, double min) {

        System.out.println("=== HASIL PERHITUNGAN IPK ===");
        System.out.printf("IPK Rata-rata : %.2f%n ", rata);
        System.out.printf("IPK Tertinggi : %.2f%n ", max);
        System.out.printf("IPK Terendah  : %.2f%n", min);

        if (rata >= 2.75) {
            System.out.print("Status: LULUS");
        } else {
            System.out.print("Status: TIDAK LULUS");
        }

    }
}
