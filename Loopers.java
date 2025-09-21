import java.util.Scanner;

public class Loopers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
         * System.out.println("Insert a number");
         * int number = input.nextInt();
         * 
         * while (number < 10) {
         * System.out.println(number);
         * number++;
         * }
         * 
         * input.close();
         */

        int hitung = input.nextInt();

        while (hitung <= 3) {
            System.out.println(hitung);
            hitung++;
        }
        System.out.println("Selamat");

        input.close();

    }

}
