import java.util.Arrays;
import java.util.Scanner;
public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to find all the top integers in an array.
        // A top integer is an integer that is bigger than all the elements to its right.
        //Input -> 1 4 3 2 Output -> 4 3 2

        int[] number = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            int currentNum = number[i];
            for (int j = i + 1; j < number.length; j++) {
                if (max < number[j]) {
                    max = number[j];
                }
            }
            if (i == number.length - 1) {
                System.out.print(currentNum);
            } else if (currentNum > max) {
                System.out.print(currentNum + " ");
            }
            max = 0;
        }
    }
}
