package DataTypes_and_Variables;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter name: %n");
        String name = sc.nextLine();
        System.out.printf("Enter family: %n");
        String family = sc.nextLine();
        System.out.printf("Enter delimiter: %n");
        String delimiter = sc.nextLine();

        System.out.println(name + delimiter + family);
    }
}
