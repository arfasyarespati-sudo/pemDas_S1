import java.util.Scanner;

public class CelFah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam Celcius= ");
        int celcius = input.nextInt();

        input.close();

        System.out.println("Konversi suhu celcius ke fahrenheit adalah = " + (celcius * 9 / 5 + 32));

    }

}
