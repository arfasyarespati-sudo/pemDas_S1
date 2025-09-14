import java.util.Scanner;

public class Benar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sebutkan satu makanan! ");
        String makanan = input.nextLine();

        switch (makanan) {
            case "Pizza":
                System.out.println("makan Pizza");
                break;
            case "Ayam":
                System.out.println("makan Ayam");
                break;
            case "Ketupat":
                System.out.println("makan Ketupat");
            default:
                System.out.println("apaansih");

                input.close();

        }

    }
}
