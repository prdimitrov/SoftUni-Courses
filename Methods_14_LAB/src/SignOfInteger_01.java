import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        printNumberSign(input);
    }

    public static void printNumberSign(int number) {
        if (number == 0) {
            System.out.printf("The number %d is zero.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negavite.", number);
        }
    }
}
