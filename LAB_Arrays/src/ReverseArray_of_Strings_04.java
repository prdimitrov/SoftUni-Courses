import java.util.Scanner;

public class ReverseArray_of_Strings_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length / 2; i++) {
            String inputOld = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = inputOld;
        }
        System.out.println(String.join(" ", input));
    }
}
