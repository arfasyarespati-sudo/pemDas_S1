
package Material;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("Selamat");
        sb.append(" ");
        sb.append("Datang");
        sb.insert(14, " " + 2026);
        System.out.println(sb);

        String text = "Halo teman teman semua";

        StringBuilder nah = new StringBuilder(text);
        nah.replace(5, 16, "Arek Malang");
        System.out.println(nah);
        input.close();
    }
}
