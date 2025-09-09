import java.util.Scanner;

public class belanja {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tanggal beli? ");
        int tanggalBeli = input.nextInt();

        System.out.println("Bulan beli? ");
        int bulanBeli = input.nextInt();

        System.out.println("Tahun beli? ");
        int tahunBeli = input.nextInt();

        System.out.println("Belanja barang? ");
        String belanjaBarang = input.nextLine();
        input.nextLine();

        System.out.println("Jumlah barang");
        int jumlahBarang = input.nextInt();

        System.out.println("Harga barang");
        double hargaBarang = input.nextDouble();

        System.out.println("Diskon");
        float diskon = input.nextFloat();

        System.out.println("Pembayaran tunai ya? ");
        boolean jenisPembayaran = input.nextBoolean();

        input.close();

        System.out.println("========= List Barang =========");
        System.out.printf("%-17s: %02d-%02d-%d\n", "Tanggal", tanggalBeli, bulanBeli, tahunBeli);
        System.out.printf("%-17s: %s\n", "Barang Belanja", belanjaBarang);
        System.out.printf("%-17s: %d\n", "Jumlah Barang", jumlahBarang);
        System.out.printf("%-17s: %,.2f\n", "Harga Barang", hargaBarang);
        System.out.printf("%-17s: %s\n", "Diskon", diskon + "%");
        System.out.println("-------------------------------");
        System.out.printf("%-17s %,.2f\n", "Total Harga", jumlahBarang * hargaBarang);
        System.out.printf("%-17s: %,.2f\n", "Pembayaran",
                ((hargaBarang * jumlahBarang - (hargaBarang * jumlahBarang * diskon / 100))));
        System.out.printf("%-17s: %s\n", "Pembayaran tunai", jenisPembayaran);
        System.out.println();

    }

}