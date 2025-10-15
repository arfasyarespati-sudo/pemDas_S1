import java.util.Scanner;

public class LuasKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        System.out.print("Pilihan anda: ");
        int pilihan = input.nextInt();

        if (pilihan == 10) {
            System.out.println("Data tak ditemukan, program dihentikan ...");
            System.exit(0);
        }

        input.nextLine();
        System.out.println("Masukkan a: ");
        int a = input.nextInt();
        System.out.println("Masukkan b:");
        int b = input.nextInt();
        System.out.println("Masukkan r: ");
        int r = input.nextInt();

        switch (pilihan) {
            case 1:
                int keliling = a * 2 + b * 2;
                int luas = a * b;
                System.out.println("Keliling persegi panjang    : " + keliling + " cm");
                System.out.println("Luas persegi panjang        : " + luas + " cm2");
                break;
            case 2:
                double keliling2 = 2 * 3.14 * r;
                double luas2 = 3.14 * r * r;
                System.out.println("Keliling lingkaran    : " + keliling2 + " cm");
                System.out.println("Luas lingkaran        : " + luas2 + " cm2");
                break;
            case 3:
                int keliling3 = a + b + r;
                int luas3 = a * b / 2;
                System.out.println("Keliling segitiga    : " + keliling3 + " cm");
                System.out.println("Luas segitiga        : " + luas3 + " cm2");
                break;
            default:
                System.out.println("Data tak ditemukan, program dihentikan ...");
                break;
        }

        input.close();

    }
}
