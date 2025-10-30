
import java.util.*;

public class FilkomMart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        double totalbelanja = input.nextDouble();
        String jenismember = input.next();
        int tglhari = input.nextInt();
        int tglbulan = input.nextInt();
        int tgltahun = input.nextInt();

        switch (jenismember) {
            case "Regular":

                if (tglhari == tglbulan) {
                    totalbelanja = totalbelanja * 0.5;
                }
                break;

            case "Gold":
                if (totalbelanja >= 50000) {
                    totalbelanja = totalbelanja - (totalbelanja * 0.1);
                    if (tglhari == tglbulan) {
                        totalbelanja = totalbelanja * 0.5;
                    }
                }

                if (tglhari == tglbulan) {
                    totalbelanja = totalbelanja * 0.5;
                }

                break;
            case "Platinum":

                if (totalbelanja >= 50000) {
                    totalbelanja = totalbelanja - (totalbelanja * 0.2);
                    if (tglhari == tglbulan) {
                        totalbelanja = totalbelanja * 0.5;
                    }
                }
                if (tglhari == tglbulan) {
                    totalbelanja = totalbelanja * 0.5;
                }

                break;
        }
        System.out.println(totalbelanja);
        input.close();
    }

}
