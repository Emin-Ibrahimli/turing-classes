package NewPackage1.RandomNum;

import java.util.Random;
import java.util.Scanner;

public class randomNumAppV1 {
    public static void main(String[] args) {
      String[] adlar = {"Tural", "Orxan", "Əbülfəz", "Emin", "Sədulla", "Yusif", "Aqil", "Hüseyn", "Ayla", "Sevinc", "Saleh", "Ülvi"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Telebe adini daxil edin: ");
//        String ad = scanner.nextLine();
//        Random random = new Random();
//        System.out.print("Random reqem sayini daxil edin: ");
//        int randomReq = scanner.nextInt();
//
//        for (int i = 0; i < adlar.length; i++) {
////            String ad = scanner.nextLine();
//            ad.compareToIgnoreCase(adlar[i]);
//            int random1 = random.nextInt(randomReq);
//            System.out.println("Sizə düşən rəqəm: " + random1);
//            return;




        Scanner scanner = new Scanner(System.in);
        System.out.print("Adı daxil edin: ");
//        Random random = new Random();
        String daxilEdilenAd = scanner.nextLine();
        System.out.print("Random reqem daxil edin: ");
        int randomReqem = scanner.nextInt();
        boolean duzgunAd = false;
        for (String ad : adlar) {
            if (ad.equalsIgnoreCase(daxilEdilenAd)) {
                duzgunAd = true;
            }

        }
        if (duzgunAd) {
            Random random = new Random();
            int random1 = random.nextInt(randomReqem);
            System.out.println("Random reqem: " + random1);
        } else {
            System.out.println("Yanlis ad daxil edilib.");
        }
    }
}