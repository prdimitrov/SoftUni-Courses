import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secondNum = Integer.parseInt(sc.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");
        //14.00 > 14
        //14.25 да си остане така
        double result = calculation(operator, firstNum, secondNum);
        System.out.println(df.format(result));
    }

    public static double calculation(String operator, int firstNum, int secondNum) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum * 1.0 / secondNum;
                break;
        }
        return result;
    }
}