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

        /*
         * while (hitung <= 3) {
         * System.out.println(hitung);
         * hitung++;
         * }
         * System.out.println("Selamat");
         */

        System.out.print("i = ");
        for (int i = input.nextInt(); i > 50; i -= 6) {
            System.out.println(i);

        }

        input.close();

    }

}
