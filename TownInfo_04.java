package DataTypes_and_Variables;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter town name: %n");
        String nameTown = scanner.nextLine();
        System.out.printf("Enter the population of the town: %n");
        int townPopulation = Integer.parseInt(scanner.nextLine());
        System.out.printf("Enter the area of the town in square km: %n");
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", nameTown, townPopulation, area);
    }
}
