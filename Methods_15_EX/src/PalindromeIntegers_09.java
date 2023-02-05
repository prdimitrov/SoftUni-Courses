import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();

        while (!number.equals("END")) {
            if (isPalindrome(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            //или sout(isPalindrome(command));

            number = sc.nextLine();
        }
    }
    //метод, който проверява дали даден текст е палиндром
    //true - ако текстът е полиндром
    //false - ако текстът ако не е палиндром
    public static boolean isPalindrome (String text) {
        //text = "Desi"
        //reversedText = "iseD"
        //палиндром е текст, който е еднакъв с обърнатия си на обратно
        String reversedText = "";

        for (int index = text.length() - 1; index >= 0 ; index--) {
        reversedText += text.charAt(index);
        }

        return text.equals(reversedText);
    }
}
