import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        printMiddleCharacters(text);
    }

    //метод, който принтира средния символ
    public static void printMiddleCharacters(String text) {
        //нечетна дължина - 1 среден символ
        if (text.length() % 2 != 0) {
            int indexOfMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            //четна дължина - 2 средни символа
            //"someText" - 8 символа (index; 3 и 4)
            //"dogs" - 4 символа (index: 1 и 2)
            //['s', 'o', 'm', 'e', 'T', 'e', 'x', 't'] - eT
            int indexOfFirstMiddleCharacter = text.length() / 2 - 1;
            int indexOfSecondMiddleCharacter = text.length() / 2; // или indexOfFirstMiddleCharacter + 1

            System.out.print(text.charAt(indexOfFirstMiddleCharacter));
            System.out.print(text.charAt(indexOfSecondMiddleCharacter));
        }
    }
}
