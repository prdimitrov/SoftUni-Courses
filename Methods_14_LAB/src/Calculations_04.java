import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String commandInput = sc.nextLine();
        int firstNumInput = Integer.parseInt(sc.nextLine());
        int secondNumInput = Integer.parseInt(sc.nextLine());

        //"add", "multiply", "subtract", "divide"

        switch (commandInput) {
            case "add":
                printAdd(firstNumInput, secondNumInput);
                break;
            case "multiply":
                printMultiply(firstNumInput, secondNumInput);
                break;

            case "subtract":
                printSubtract(firstNumInput, secondNumInput);
                break;

            case "divide":
                printDivide(firstNumInput, secondNumInput);
                break;
        }


    }

    public static void printAdd(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void printMultiply(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void printSubtract(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void printDivide(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
