public class Prak_rekursif {
    public static void main(String[] args) {
        int jumlahSuku = 5;

        System.out.println("Deret Fibonacci (" + jumlahSuku + " suku):");

        for (int i = 0; i < jumlahSuku; i++) {
            int nilaiSuku = fibonacci(i);
            System.out.print(nilaiSuku);

            if (i < jumlahSuku - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
