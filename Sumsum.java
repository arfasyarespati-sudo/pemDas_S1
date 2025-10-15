import java.util.Scanner;

public class Sumsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean valid = true;
        int jumlah = 0;
        int data[] = new int[1000];
        float avg, sum = 0;

        while (valid) {
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
                case 0:
                    valid = false;
                    System.out.println("Program selesai, terimakasih");
                    break;

                case 1:
                    System.out.println("Jumlah data: ");
                    jumlah = in.nextInt();

                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Masukkan data: ");
                        data[i] = in.nextInt();
                    }
                    break;

                case 2:
                    if (jumlah == 0) {
                        System.out.println("Tidak ada data");
                    } else {
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("Data anda: " + data[i]);
                        }
                    }
                    break;

                case 3:
                    sum = 0;
                    for (int i = 0; i < jumlah; i++) {
                        sum += data[i];
                    }
                    avg = sum / jumlah;
                    System.out.println("Average: " + avg);
                    break;

                case 4:
                    sum = 0;
                    for (int i = 0; i < jumlah; i++) {
                        sum += data[i];
                    }
                    System.out.println("Sum: " + sum);
                    break;

                case 5:
                    int max = data[0];
                    for (int i = 0; i < jumlah; i++) {
                        if (data[i] > max) {
                            max = data[i];
                        }
                    }
                    System.out.println("Nilai max: " + max);
                    break;

                case 6:
                    int min = data[0];
                    for (int i = 0; i < jumlah; i++) {
                        if (data[i] < min) {
                            min = data[i];
                        }
                    }
                    System.out.println("Nilai min: " + min);
                    break;

                default:
                    System.out.println("Pilihan tidak valid, Menu berhenti... ");
                    return;
            }
        }
        in.close();
    }
}