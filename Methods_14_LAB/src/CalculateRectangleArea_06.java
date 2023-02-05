import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int widthInput = Integer.parseInt(sc.nextLine());
        int lengthInput = Integer.parseInt(sc.nextLine());

        int area = calculateRectangleArea(widthInput, lengthInput);
        System.out.println(area);
    }

    public static int calculateRectangleArea(int width, int length) {
        return width * length;
    }
}
