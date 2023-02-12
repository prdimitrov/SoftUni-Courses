import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();


        while (!command.equals("end")) {

            if (command.startsWith("Delete")) {
                int deleteCommand = Integer.parseInt(command.split(" ")[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    for (int j = i + 1; j < numbers.size(); j++) {
                        if (numbers.indexOf(i) == numbers.indexOf(i + 1)) {
                            numbers.removeAll(Collections.singleton(deleteCommand));
                        }
                    }
                }
            } else if (command.startsWith("Insert")) {
                int newNumber = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position, newNumber);
            }
            command = sc.nextLine();

        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
