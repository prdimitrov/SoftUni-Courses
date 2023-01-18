package DataTypes_and_Variables;

import java.util.Scanner;

public class Pounds_to_Dollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dollars = Integer.parseInt(scanner.nextLine());

        double pounds = dollars * 1.36;

        System.out.printf("%.3f", pounds);
    }
}
