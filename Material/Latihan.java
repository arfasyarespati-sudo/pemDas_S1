package Material;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * System.out.print("Masukkan jumlah elemen: ");
         * int n = in.nextInt();
         * int[] angka = new int[n];
         * 
         * for (int i = 0; i < n; i++) {
         * System.out.print("Masukkan angka: ");
         * angka[i] = in.nextInt();
         * }
         * 
         * int jumlahGenap = 0;
         * int jumlahGanjil = 0;
         * 
         * for (int i = 0; i < n; i++) {
         * 
         * if (angka[i] % 2 == 0)
         * jumlahGenap++;
         * else
         * jumlahGanjil++;
         * 
         * }
         * 
         * System.out.println("Jumlah genap " + jumlahGenap);
         * System.out.println("Jumlah ganjil " + jumlahGanjil);
         */
        System.out.print("ada berapa data? ");
        int a = in.nextInt();
        int[] arr = new int[a];
        int total = 0;
        boolean menu = true;
        double avg = 0;

        while (menu) {
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < a; i++) {

                        System.out.print("Masukkan data: ");
                        arr[i] = in.nextInt();
                        System.out.println();

                    }
                    break;
                case 2:
                    for (int lihatData : arr) {
                        System.out.println("Data mu: " + lihatData);

                    }
                    break;
                case 3:
                    total = 0;
                    for (int lihatData : arr) {
                        total += lihatData;
                    }

                    if (a > 0) {
                        avg = (double) total / a;
                        System.out.println("Rata-rata: " + avg);
                    } else {
                        System.out.println("Data tidak dapat dihitung....");
                    }
                    break;
                case 4:
                    total = 0;
                    for (int lihatData : arr) {
                        total += lihatData;

                    }
                    System.out.println("Total (Sum): " + total);
                    break;
                case 5:
                    int max = arr[0];
                    for (int i = 0; i < a; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Max adalah " + max);
                    break;
                case 6:
                    int min = arr[0];
                    for (int i = 0; i < a; i++) {
                        if (arr[i] > min) {
                            min = arr[i];
                        }
                    }
                    System.out.println("Min adalah: " + min);
                    break;
                case 0:
                    menu = false;
                    System.out.println("Keluar..");

                    return;

            }
        }
        in.close();
    }
}
