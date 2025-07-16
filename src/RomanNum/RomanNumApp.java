package RomanNum;

import java.util.Scanner;

public class RomanNumApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Num objecet1 = new Num();

        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();

        String roman = objecet1.intRoman(number);
        System.out.println("Roman :" + roman);
    }

}