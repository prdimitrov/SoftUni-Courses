import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. прочитаме лист от цели числа
        List<Integer> numbers = Arrays.stream(sc.nextLine()// "4 19 2 53 6 43"
                        .split(" ")) // {"4", "19", "2", "53", "6", "43"}
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //2. въвеждаме команди, докато не получим end
        String command = sc.nextLine();

        while (!command.equals("end")) {
            if (command.startsWith("Contains")) {
                //command = "Contains 5".split(" ") -> ["Contains", "5"]
                int numberToCheck = Integer.parseInt(command.split(" ")[1]);
                //yes -> ако числото го има в списъка
                if (numbers.contains(numberToCheck)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print even")) {
                //само четните числа
                printEvenNumbers(numbers);
            } else if (command.equals("Print odd")) {
                //само нечетните числа
                printOddNumbers(numbers);
            } else if (command.equals("Get sum")) {
                //принтираме сумата на елементите в списъка
                printSum(numbers);
            } else if (command.startsWith("Filter")) {
                //command = "Filter {condition} {number}" => "Filter >= 43".split(" ")
                //["Filter", ">=", "43"]
                String condition = command.split(" ")[1]; // ">="
                int numberToFilter = Integer.parseInt(command.split(" ")[2]); // "43"
                printFilteredNumbers(numbers, condition, numberToFilter);
            }
        }


    }

    private static void printFilteredNumbers(List<Integer> numbers, String condition, int numberToFilter) {
        //condition = '<', '>', ">=", "<="
        switch (condition) {
            case "<":
                //отпечатваме всички числа в списъка numbers < numberToFilter
                for (int number:numbers) {
                    if (number < numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                //отпечатваме всички числа в списъка numbers > numberToFilter
                for (int number:numbers) {
                    if (number > numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">=":
                for (int number:numbers) {
                    if (number >= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
            case "<=":
                for (int number:numbers) {
                    if (number <= numberToFilter) {
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }

    public static void printSum(List<Integer> numbers) {
        int sum = 0; //сума на числата в списъка
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        //numbers = {4, 19, 2, 53, 6, 43}
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}
