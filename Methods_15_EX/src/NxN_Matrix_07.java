import java.util.Scanner;

public class NxN_Matrix_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        printTheMatrix(n);

    }
    public static void printTheMatrix (int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                System.out.print(input + " ");
            }
            System.out.println();
        }
    }
}
