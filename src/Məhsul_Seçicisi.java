import java.util.Scanner;

public class Məhsul_Seçicisi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Məhsulun kodunu daxil edin: ");
        int kod = scanner.nextInt();

            switch (kod) {
                case 1:
                    System.out.println("Məhsulun adı:Soda - Məhsulun qiyməti:1.20$");
                    break;
                case 2:
                    System.out.println("Məhsulun adı:Şkolad çubuğu - Məhsulun qiyməti:2.00$");
                    break;
                case 3:
                    System.out.println("Məhsulun adı:Fişlər - Məhsulun qiyməti:1.20$");
                    break;
                case 4:
                    System.out.println("Məhsulun adı:Sendviç - Məhsulun qiyməti:3.00$");
                    break;
                case 5:
                    System.out.println("Məhsulun adı:Su - Məhsulun qiyməti:1.00$");
                    break;
                default:
                    System.out.println("Kodu yanlış qeyd etmisiniz.");
                    break;

            }
    }
}
