import java.util.Scanner;

public class Smallest_of_ThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());
        smallestInteger(firstInput, secondInput, thirdInput);
    }

    public static void smallestInteger(int first, int second, int third) {
        if (first < second) {
            System.out.println(first);
        } else if (second < third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
