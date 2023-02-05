import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstInput = sc.nextLine().charAt(0);
        char secondInput = sc.nextLine().charAt(0);

        printCharsBetweenTwoChars(firstInput, secondInput);

    }

    public static void printCharsBetweenTwoChars (char firstCharacter, char secondCharacter) {
            int startCharacter = Math.min(firstCharacter, secondCharacter);
            int endCharacter = Math.max(firstCharacter, secondCharacter);

        for (int i = ++startCharacter; i < endCharacter; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}
