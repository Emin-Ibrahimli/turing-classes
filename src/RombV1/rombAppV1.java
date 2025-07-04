package RombV1;

import java.util.Scanner;

public class rombAppV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzunluqu daxil edin: ");
        int u = scanner.nextInt();

        //        int u = 5;
        for (int i = 0; i < u; i++) {
            for (int j = 0; j < u - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
//            for (int j = 0; j < 2 * u - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        System.out.println();
        for (int i = u - 2; i >= 0; i--) {
            for (int j = 0; j < u - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
