import java.util.Scanner;

public class Telebe_Imtahaninin_Qiymetlendirilmesi {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Qiyməti daxil et:" );
        int qiymet1 = scanner.nextInt();
        int qiymet2=scanner.nextInt();
        int qiymet3=scanner.nextInt();
        if (qiymet1 < 0 || qiymet1 > 100 ||
                qiymet2 < 0 || qiymet2 > 100 ||
                qiymet3 < 0 || qiymet3 > 100){
            System.out.println("Yanlış qiymət");
            return;
        }
        double ortalama = (qiymet1+qiymet2+qiymet3)/3.0;
        System.out.println((ortalama >= 0 && ortalama <= 100)?
                (ortalama <= 40) ? "Təəsüf ki siz keçə bilmədiniz." :
                       // (qiymet >40 && qiymet < 70) ? "Siz imtahandan keçdiniz." :
                                (ortalama >= 70 && ortalama < 85)?"Təbriklər siz uğurla keçdiniz.Siz nəailiyyət sertifkatı qazandınız.":
                                        (ortalama >= 85 && ortalama <= 100)? "Təbrik edirik! Siz sertifikat qazandınız." :"Siz imtahandan keçdiniz." : "Yanlış qiymət");



        //Scanner scanner=new Scanner(System.in);
//        System.out.print("Qiymet daxil edin");
//        int qiymet1=scanner.nextInt();
//        int qiymet2=scanner.nextInt();
//        int qiymet3=scanner.nextInt();
//
//        if (qiymet1 < 0 || qiymet1 > 100||
//                qiymet2 < 0 || qiymet2 > 100 ||
//                qiymet3 < 0 || qiymet3 > 100){
//            System.out.println("Yanlış qiymət");
//            return;
//        }
//
//        double ortalama = (qiymet1 + qiymet2 + qiymet3) / 3.0;
//
//        if (ortalama >= 0 && ortalama <= 100) {
//
//        }
//        if (ortalama >= 0 && ortalama <= 40){
//            System.out.println("Təəsüf ki siz keçə bilmədiz.");
//        }
//        else if (ortalama > 40 && ortalama < 70){
//            System.out.println("Siz imtahandan keçdiniz.");
//        }
//        else if (ortalama >= 70 && ortalama < 85){
//            System.out.println("Təbriklər siz uğurla keçdiniz.Siz nəailiyyət sertifkatı qazandınız.");
//        }
//        else if (ortalama >= 85 && ortalama <= 100) {
//            System.out.println("Təbrik edirik! Siz sertifikat qazandınız.");
//        }
//        else{
//            System.out.println("Yanlış qiymət");
//        }
    }



}
