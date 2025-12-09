package Material;

import java.util.Scanner;

public class Wingit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jum = input.nextInt();
        int[] x = new int[jum];
        int[] y = new int[jum];
        int[] kirim = new int[jum];

        for (int i = 0; i < jum; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
            kirim[i] = input.nextInt();
        }

        double bestbuy = 0;
        int bestindex = 0;

        for (int j = 0; j < jum; j++) {
            int xi = x[0] - x[j];
            if (xi < 0) {
                xi = xi * -1;
            }
            int yi = y[0] - y[j];
            if (yi < 0) {
                yi = yi * -1;
            }
            bestbuy += (xi + yi) * kirim[j];
        }
        for (int i = 1; i < jum; i++) {
            double total = 0;

            for (int j = 0; j < jum; j++) {
                int dx = x[i] - x[j];
                if (dx < 0)
                    dx = dx * -1;

                int dy = y[i] - y[j];
                if (dy < 0)
                    dy = dy * -1;

                total += (dx + dy) * kirim[j];
            }

            if (total < bestbuy) {
                bestbuy = total;
                bestindex = i;
            }
        }

        System.out.printf("%d %.2f\n", bestindex, bestbuy);

        input.close();
    }
}
