package Methods_15_MoreExercises;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataType = sc.nextLine();
        String inputData = sc.nextLine();
        inputConvert(dataType, inputData);
    }
    public static void inputConvert (String dataType, String value) {
        int integerValue = 0;
        double realValue = 0.0;
        if (dataType.equals("int")) {
            integerValue = Integer.parseInt(value) * 2;
            System.out.println(integerValue);
        } else if (dataType.equals("real")) {
            realValue = Double.parseDouble(value) * 1.5;
            System.out.printf("%.2f", realValue);
        } else if (dataType.equals("string")) {
            System.out.printf("$%s$", value);
        }
    }
}
