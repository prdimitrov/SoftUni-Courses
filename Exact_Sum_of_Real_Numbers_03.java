package DataTypes_and_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_of_Real_Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int integer = 2147483647;
        BigDecimal sum = new BigDecimal("0");
        for (int i = 1; i <= n; i++) {
            BigDecimal d = new BigDecimal(scanner.nextLine());
            sum = sum.add(d);
        }
        System.out.println(sum);
    }
}