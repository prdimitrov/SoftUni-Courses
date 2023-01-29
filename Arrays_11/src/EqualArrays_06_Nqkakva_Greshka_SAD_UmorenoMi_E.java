import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06_Nqkakva_Greshka_SAD_UmorenoMi_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int[] firstArr = Arrays
                .stream(sc.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = firstArr.length;
        for (int i = 0; i < maxLength; i++) {
            sum += firstArr[i];
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index", i);
            } else {
                sum += firstArr[i] + secondArr[i];
            }
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}