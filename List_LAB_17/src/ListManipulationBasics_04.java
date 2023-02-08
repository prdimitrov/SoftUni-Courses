import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
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
            //валидна команда
            if (command.contains("Add")) { //.contains проверява дали в текста има думата "Add" примерно
                //command = "Add {number}" -> "Add 4".split(" ") -> ["Add", "4"]
                //[1] -> "4" parse int -> 4
                int elementToAdd = Integer.parseInt(command.split(" ")[1]); //кой е елементът, който трябва да добавя накрая на списъка
                numbers.add(elementToAdd);

            } else if (command.contains("RemoveAt")) {
                //command = "RemoveAt {index}" -> "Remove 3" -> "RemoveAt 3".split(" ") -> ["RemoveAt", "3"]
                //[1] -> "3" parse int -> 3
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(indexToRemove); //премахвам елемента на дадения индекс
            } else if (command.contains("Remove")) {
                //command = "Remove {number}" -> "Remove 5".split(" ") -> ["Remove", "5"]
                //[1] -> "5" parse int -> 5
                int elementToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(elementToRemove)); //показвам, че искам да премахна елемента
            } else if (command.contains("Insert")) {
                //command = "Insert {number} {index}" -> "Insert 2 3".split(" ") -> ["Insert", "2", "3"]
                String[] commandParts = command.split(" "); // частите на командата
                //"Insert 2 3".split(" ") -> ["Insert", "2", "3"]
                int number = Integer.parseInt(commandParts[1]); //"2" -> 2
                int index = Integer.parseInt(commandParts[2]); //"3" -> 3

                numbers.add(index, number);

            }
            command = sc.nextLine();
        }
        //numbers = {4, 53, 6, 8, 43, 3}
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
