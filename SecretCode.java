import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan id");
        int id = input.nextInt();
        System.out.println("Banyak");
        int banyak = input.nextInt();
        int[] arr = new int[banyak];

        for (int i = 0; i < banyak; i++) {
            arr[i] = input.nextInt();
        }

        StringBuilder pesan = new StringBuilder();
        StringBuilder salah = new StringBuilder();

        for (int numba : arr) {
            if (numba >= id && numba <= id + 25) {
                char huruf = (char) ('A' + (numba - id));
                pesan.append(huruf);

            } else if (numba == id + 26) {
                pesan.append(" ");

            } else {

                if (salah.length() > 0) {
                    salah.append(", ");

                }
                salah.append(numba);

            }
        }

        System.out.println("Output pesan: " + pesan.toString());
        if (salah.length() > 0)
            System.out.println("Elemen tidak valid ditemukan: " + salah.toString().trim());

        input.close();

    }
}