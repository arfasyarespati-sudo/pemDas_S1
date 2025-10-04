import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Bunga[] = { "rose", "violet", "dandelion", "anggrek", "matahari" };
        // System.out.println("Masukkan angka");
        // int AngkaBunga = input.nextInt();
        // System.out.println(Bunga[AngkaBunga]);

        for (int i = 0; i < Bunga.length; i++)
            System.out.println(Bunga[i]);
        input.close();
    }

}
