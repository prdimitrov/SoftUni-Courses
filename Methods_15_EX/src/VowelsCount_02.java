import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        printVowelsCount(text);
    }
    public static void printVowelsCount(String text) {
        int count = 0;
        for (char symbol : text.toLowerCase().toCharArray()) {
            //проверка дали е гласна буква
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
