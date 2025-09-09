import java.util.Scanner;

public class listrik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama   : ");
        String namaOrang = input.nextLine();

        System.out.println("Kelurahan : ");
        String namaKelurahan = input.nextLine();

        System.out.println("Masukkan posisi awal Kwh Meter : ");
        int awalKwh = input.nextInt();

        System.out.println("Masukkan poisisi akhir Kwh Meter : ");
        int akhirKwh = input.nextInt();

        System.out.println("Masukkan biaya beban saat ini  : ");
        int biayaBeban = input.nextInt();

        System.out.println("Masukkan PPJ (dalam persen) : ");
        int PPJ = input.nextInt();

        input.close();

        System.out.println("===================PLN Java===================");
        System.out.println("Nama          : " + namaOrang);
        System.out.println("Kelurahan     : " + namaKelurahan);
        System.out.println("Pemakaian bulan ini : " + (akhirKwh - awalKwh));
        System.out.println("Tarif listrik : " + (akhirKwh - awalKwh) * biayaBeban);
        System.out.println("PPJ 10%       : " + (biayaBeban * PPJ * 10));
        System.out.println("Total bayar   : " + ((akhirKwh - awalKwh) * (biayaBeban) + (biayaBeban * PPJ * 10)));
        System.out.println("==============================================");

    }

}
