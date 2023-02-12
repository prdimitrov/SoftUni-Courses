import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> passengers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] currentCommand = command.split("\\s+");
            if (currentCommand.length == 1) {
                int passengersToDistribute = Integer.parseInt(command);
                for (int i = 0; i < passengers.size(); i++) {
                    if (passengersToDistribute + passengers.get(i) <= maxCapacity) {
                        int people = passengersToDistribute + passengers.get(i);
                        passengers.remove(i);
                        passengers.add(i, people);
                        break;
                    }
                }
            } else {
                int numberOfPassengersToAdd = Integer.parseInt(currentCommand[1]);
                passengers.add(numberOfPassengersToAdd);
            }
            command = sc.nextLine();
        }
        for (int passenger : passengers) {
            System.out.printf("%d ", passenger);
        }
    }
}
