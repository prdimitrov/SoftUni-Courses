import java.util.Scanner;

public class RepeatStrings_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputText = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(n, inputText));
    }

    public static String repeatString(int n, String text) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + text;
        }
        return result;
    }
}
