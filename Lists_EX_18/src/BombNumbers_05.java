import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String specialBomb = sc.nextLine();
        int bombNumber = Integer.parseInt(specialBomb.split(" ")[0]);
        int bombPower = Integer.parseInt(specialBomb.split(" ")[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber) {
                if (i == numbers.size() - 1) {
                    for (int j = 1; j <= bombPower; j++) {
                        numbers.remove(i - 1);
                    }
                } else if (i == 0) {
                    for (int j = 0; j <= bombPower; j++) {
                        numbers.remove(i + 1);
                    }
                } else {
                    for (int j = 1; j <= bombPower; j++) {
                        if (i + 1 == numbers.size()) {
                            break;
                        }
                        numbers.remove(i + 1);
                    }
                    for (int j = 1; j <= bombPower; j++) {
                        if (i - 1 < 0) {
                            break;
                        }
                        numbers.remove(i - 1);
                        i -= 1;
                    }
                }
                numbers.remove(i);
                i -= 1;
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
