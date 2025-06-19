import java.util.Scanner;

public class Vurma_Cedveli {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.print("İlk öncə daxil etmək itədiyiniz ədədi qeyd edin və daha sonra dövrü qeyd edin.");
        int Ədəd = scanner.nextInt();
        int dövr = scanner.nextInt();
        for (int i = 1; i <= dövr ; i++){
            System.out.println(Ədəd + "*" + i + "=" + (Ədəd * i));

        }
    }


}
