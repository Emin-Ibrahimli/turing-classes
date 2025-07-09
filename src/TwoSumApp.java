import java.util.Scanner;

public class TwoSumApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cemini tapmaq istediyiniz ededi daxil edin: ");
        int eded = scanner.nextInt();
        Boolean tapildi = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == eded) {
                    System.out.println("Indexler: " + "[" + i + "]" + ";" + "[" + j + "]");
                }
            }
        }
        if(!tapildi){
            System.out.println("Beraber index tapilmadi!");
        }
    }
}
