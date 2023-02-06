package Methods_15_MoreExercises;

import java.util.Scanner;

public class CenterPoint_02 {
    public CenterPoint_02() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int pointOne = x1 + y1;
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());
        int pointTwo = x2 + y2;
        if (pointOne == pointTwo) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            checkIfThePointIsCloserToTheCenter(x1, y1, x2, y2);
        }

    }

    public static void checkIfThePointIsCloserToTheCenter(int x1, int y1, int x2, int y2) {
        int firstPoint = x1 + y1;
        int secondPoint = x2 + y2;
        if (firstPoint < secondPoint) {
            System.out.printf("(%d, %d)", x1, y1);
        } else {
            System.out.printf("(%d, %d)", x2, y2);
        }

    }
}
