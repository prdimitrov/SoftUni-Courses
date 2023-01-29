import java.util.Arrays;
import java.util.Scanner;

public class Even_and_Odd_Substraction_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt((e -> Integer.parseInt(e)))
                .toArray();
        //МОЖЕ И НА ЕДИН РЕД ДА СЕ НАПИШАТ ТЕЗИ ТОЧКИ!!!!!!
        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}