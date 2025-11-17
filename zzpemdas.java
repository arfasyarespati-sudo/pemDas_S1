import java.util.Scanner;

public class zzpemdas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai a: ");
        double A = in.nextDouble();
        System.out.print("Nilai b: ");
        double B = in.nextDouble();
        System.out.print("Nilai c: ");
        double C = in.nextDouble();

        if ((B * B) - (4 * A * C) > 0) {
            System.out.println("The equation has two roots " + perhitungan1(A, B, C) + " and " + perhitungan2(A, B, C));

        } else if ((B * B) - (4 * A * C) == 0) {
            System.out.println("The equation has one root " + perhitungan1(A, B, C));
        } else {
            System.out.println("The equation has no real roots ");
        }
        in.close();
    }

    static double perhitungan1(double a, double b, double c) {
        double x = (b * b) - (4 * a * c);
        double rumus = (-b + Math.sqrt(x)) / (2 * a);
        return rumus;
    }

    static double perhitungan2(double a, double b, double c) {
        double x = (b * b) - (4 * a * c);
        double rumus = (-b - Math.sqrt(x)) / (2 * a);
        return rumus;
    }

}
