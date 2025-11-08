import java.util.Scanner;

//Mau kalian pakai method string atau tidak kerangka besarnya sama 
public class FormatText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();

        String hasil = ubahFormat(kalimat);
        int jumlahVokal = hitungVokal(kalimat);
        tampilkanHasil(hasil, jumlahVokal);

        input.close();
    }

    static String ubahFormat(String teks) {
        // isi
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            if (c == ' ') {
                c = '-';
            }
            hasil.append(c);
        }
        return hasil.toString();
    }

    static int hitungVokal(String teks) {
        int count = 0;
        teks = teks.toUpperCase();

        for (int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            if (c == 'A' || c == 'I' || c == 'U' || c == 'E' || c == 'O') {
                count++;
            }
        }
        return count;
    }

    static void tampilkanHasil(String hasil, int vokal) {
        System.out.println("Kalimat hasil format :" + hasil);
        System.out.println("Jumlah huruf vokal :" + vokal);
    }
}
