package DataTypes_and_Variables;

import java.util.Scanner;

public class ConvertMeters_to_Kilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = meters * 0.001;

        System.out.printf("%.2f", kilometers);
    }
}
