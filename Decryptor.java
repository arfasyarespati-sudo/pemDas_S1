import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt(); //input id
        int n = scanner.nextInt(); // input banyak 
        int[] code = new int[n];
        for (int i = 0; i < n; i++) {
            code[i] = scanner.nextInt();
        }

        System.out.print("Decrypted message: ");
        for (int i = 0; i < n; i++) {
            if (code[i] >= id && code[i] <= id + 25) {
                System.out.print((char) (code[i] - id + 'A'));
            } else if (code[i] == id + 26) {
                System.out.print(" ");
            } else {
                System.out.print(code[i] + " ");
            }
        }
        System.out.println();
    }
}
