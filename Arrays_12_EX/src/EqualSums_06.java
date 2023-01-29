import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            //int currentElement = numbers[index]; това защо го писаха изобщо Десислава не знам?!....

            int leftSum = 0; //сума от елементите в ляво
            int rightSum = 0; //сума от елементите в дясно

            //1. Да си намеря сумата на елементите в ляво от моето число
            //[3, 6, 9, 23, 12, 5, 6]
            //лява сума: всички елементи от първия индекс(0) до моя индекс (но не го включваме)
            //leftIndex -> всички индекси на число, които са от ляво на моето
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            //2. Да си намеря сумата на елементите в дясно от моето число
            //[3, 6, 9, 23, 12, 5, 6]
            //дясна сума: всички елементи след моя до последния (дължината на масива - 1)
            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            //3. Проверка дали са равни двете суми
            if (leftSum == rightSum) {
                System.out.println(index);
                return; // прекъсвам цялата програма
            }
        }
        //обходил всички числа в масива и за никое не ми е било вярно условието
        System.out.println("no");
    }
}
