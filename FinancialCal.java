import java.util.Scanner;

public class FinancialCal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Loan amount: ");
        double pinjaman = in.nextDouble();

        System.out.print("Number of Years: ");
        double tahun = in.nextInt();
        double bulan = tahun * 12;

        System.out.printf("%-16s%-16s%-16s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        for (double bunga = 5.0; bunga <= 8.0; bunga += 0.125) {
            double bungaBulanan = (bunga / 100) / 12;
            double bayarPerbulan = pinjaman * bungaBulanan / (1 - (1 / Math.pow(1 + bungaBulanan, bulan)));
            double total = bayarPerbulan * bulan;

            System.out.printf("%-5.3f%%%-10s%-16.2f%-16.2f\n", bunga, "", bayarPerbulan, total);
        }
        in.close();
    }
}
