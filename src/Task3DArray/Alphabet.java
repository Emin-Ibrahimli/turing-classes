package Task3DArray;

public class Alphabet {
    public static void main(String[] args) {

        String[][][] arrayName = new String[3][3][3];
        char lower = 'a';
        char upper = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (lower <= 'z' && upper <= 'Z') {
                        arrayName[i][j][k] = "" + lower + upper;
                        lower++;
                        upper++;
                    } else {
                        arrayName[i][j][k] = "--";
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Block" + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arrayName[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("------");
        }
    }
}
