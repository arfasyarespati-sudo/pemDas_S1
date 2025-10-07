
import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input id ");
        int id = input.nextInt();
        int n = input.nextInt(); // length
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        StringBuilder pesan = new StringBuilder();
        StringBuilder salah = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int numba = arr[i];

            if (numba >= id && numba <= id + 25) {
                char huruf = (char) ('A' + (numba - id));
                pesan.append(huruf);

            } else if (numba == id + 26) {
                pesan.append(" ");

            } else {
                salah.append(numba).append(", ");
            }
        }

        System.out.println(pesan.toString());
        if (salah.length() > 0) {
            System.out.println("Elemen tidak valid ditemukan: " + salah.toString().trim());
        }

        input.close();
    }

}