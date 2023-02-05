import java.util.Scanner;

public class SignOfInteger_01Veronika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printNumberSign(num);
    }

    public static void printNumberSign(int num) {
        String signWord = "";
        if (num < 0) {
            signWord = "negative";
        } else if (num > 0) {
            signWord = "positive";
        } else {
            signWord = "zero";
        }
        System.out.printf("The number %d is %s. %n", num, signWord);
    }
}
