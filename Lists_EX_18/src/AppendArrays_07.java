import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\|");

        List<String> newList = new ArrayList<>();

        for (String s : input) {
            String[] currentArr = s.split("\\s+");

            for (int i = currentArr.length - 1; i >= 0; i--) {
                if (!currentArr[i].equals("")) {
                    newList.add(0, currentArr[i]);
                }
            }
        }
        for (String s : newList) {
            System.out.print(s + " ");
        }
    }
}