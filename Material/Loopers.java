package Material;

import java.util.Scanner;

public class Loopers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int element = input.nextInt();
        int arr[] = new int[element];

        for (int i = 0; i < element; i++)
            System.out.println(arr[i]);

        input.close();
    }
}
