import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numbers = Arrays.stream(sc.nextLine()
                .split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int targetSum = Integer.parseInt(sc.nextLine());

        //обхождаме всички елементи в масива
        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index]; // числото от масива на текущия индекс
            //обходя всички числа след моето
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i]; // число, което е след моето

                if (currentNumber + nextNumber == targetSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
