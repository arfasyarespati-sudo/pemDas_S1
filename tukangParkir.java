
import java.util.Scanner;

public class tukangParkir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.println("masukan kendaraan ");
        String kendaraan = input.nextLine();

        // System.out.println("masukkan menit");
        double menitParkir = input.nextDouble();

        double jamParkir = menitParkir / 60;
        double biayaParkir = 0;
        String keluar = "";

        if (menitParkir <= 0) {
            keluar = "Misiiii input ga valid nihh!!";
        } else if (!kendaraan.equalsIgnoreCase("motor") && !kendaraan.equalsIgnoreCase("mobil")) {
            keluar = "Jalan kaki tidak perlu bayar parkir";
        } else {
            if (menitParkir <= 5) {
                biayaParkir = 3000;
            } else if (menitParkir <= 120) {
                biayaParkir = 5000;
            } else
                biayaParkir = 5000 + ((menitParkir - 120) / 10) * 2000;

            keluar = "Biaya parkir " + kendaraan + " selama " + jamParkir + " jam adalah Rp "
                    + String.format("%,.2f", (double) biayaParkir);

        }
        System.out.println(keluar);

        input.close();

    }

}
