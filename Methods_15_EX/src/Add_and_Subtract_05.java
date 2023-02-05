import java.util.Scanner;

public class Add_and_Subtract_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstInput = Integer.parseInt(sc.nextLine());
        int secondInput = Integer.parseInt(sc.nextLine());
        int thirdInput = Integer.parseInt(sc.nextLine());

        System.out.println(sumOfTwoIntegers(firstInput, secondInput) - thirdInput);
    }

    public static int sumOfTwoIntegers(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
