//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a=5;
        long b=7;
        int c=3;
        double result = (a++)+(--b)-(a++)+(a+=3)+(++c);
        System.out.printf("result : %.2f, a: %.2f, b: %d, c: %d", result,a,b,c);



    }
}