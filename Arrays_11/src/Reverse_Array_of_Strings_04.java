import java.util.Scanner;

public class Reverse_Array_of_Strings_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String oldElement = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elements));
    }
}