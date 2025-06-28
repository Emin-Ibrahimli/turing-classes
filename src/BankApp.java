import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        String[] userName = {"Ali", "veli", "Ayan"};
        double[] balance = {100.0, 150.0, 80.0};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mini bank menyusu");
            System.out.println("1.Balansa bax");
            System.out.println("2.Pul yatir");
            System.out.println("3.Pul cixar");
            System.out.println("4.Adi deyis");
            System.out.println("5.Cixis");
            System.out.print("Secim edin : ");
            int user = scanner.nextInt();

            switch (user) {
                case 1:
                    showBalance(userName, balance, scanner);
                    break;
                case 2:
                    investsMoney(userName, balance, scanner);
                    break;
                case 3:
                    cashWithdrawal(userName, balance, scanner);
                    break;

                case 4:
                    changeName(userName, scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }

    public static void showBalance(String[] names, double[] balance, Scanner scanner) {
        scanner.nextLine();
        String name = scanner.nextLine();
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
            }
        }
        System.out.println("Balance : " + balance[index]);


    }

    public static void investsMoney(String[] names, double[] balance, Scanner scanner) {
        scanner.nextLine();
        String name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
            }
        }
        System.out.println("Əlavə məbləğ ");

        double amount = scanner.nextDouble();
        double price = amount + balance[index];
        System.out.println(price);

    }

    public static void cashWithdrawal(String[] names, double[] balance, Scanner scanner) {
        scanner.nextLine();
        String name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                index = i;
            }
        }
        System.out.println("Məbləğ çıxarşı:  ");

        double amount = scanner.nextDouble();
        double price = balance[index] - amount;
        System.out.println(price);


    }

    public static void changeName(String[] array,Scanner scanner) {
       int index = -1;
       scanner.nextLine();
        System.out.print("Köhnə adı daxil et: ");
       String name = scanner.nextLine();
       for (int i = 0; i < array.length; i++) {
           if (array[i].equals(name)) {
               index = i;
           }
       }
        System.out.print("Yeni ad daxil et: ");
       String newName = scanner.nextLine();
       array[index] = newName;

    }
}