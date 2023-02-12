import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //КАТО ПИШЕМ .split("\\s+"), АКО СЛУЧАЙНО НЯКОЙ НАПИШЕ НЯКОЛКО ИНТЕРВАЛА БЕЗ ДА ИСКА!!!!!
        // \\s+ ОЗНАЧАВА СПЛИТВАНЕ ПО ЕДИН ИЛИ ПОВЕЧЕ ИНТЕРВАЛИ !!
        //По-забавна задача няма просто :D
        List<Integer> numbers = Arrays.stream(sc.nextLine() //"1 23 29 18 43 21 20"
                .split("\\s+")) //["1", "23", "29", "18", "43", "21", "20"]
                .map(Integer::parseInt) //[1, 23, 29, 18, 43, 21, 20]
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("End")) {


            if (command.contains("Add")) {
                //command = "Add {number}"
                //command = "Add 5".split(" ") -> ["Add", "5"][1] -> "5"
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Insert")) {
                //command = "Insert {number} {index}"
                //command = "Insert 128 1".split(" ") -> "[Insert", "120", "1"]
                String [] commandParts = command.split("\\s+"); //["Insert", "120", "1"]
                int numberToInsert = Integer.parseInt(commandParts[1]); //"120" -> parse -> 120
                int index= Integer.parseInt(commandParts[2]); //"1" -> parse -> 1

                //искам да вмъкна на индекс (index) числото (numberToInsert)

                //Долната проверка е много важна защото трябва да знаем дали има такъв индекс,
                //защото може да се бъгне програмата, ако въведем индекс, който не съществува изобщо!!!!!!!!!
                //1. Първо проверявам в списъка дали съществува такъв индекс
                if (index >= 0 && index <= numbers.size() - 1) {
                    //2. вмъквам числото на дадения индекс
                    numbers.add(index, numberToInsert);
                } else {
                    //В случай, че имаме невалиден индекс!!!!
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                //command = "Remove {index}"
                //command = "Remove 4".split(" ") -> ["Remove", "4"]
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]); //"4" -> parse -> 4
                //премахвам елемента на дадения индекс
                //1. ПРОВЕРЯВАМЕ ДАЛИ ИЗОБЩО СЪЩЕСТВУВА ТАКЪВ ИНДЕКС
                if (indexForRemove >= 0 && indexForRemove <= numbers.size() - 1) {
                    //2. ПРЕМАХВАМ ЧИСЛОТО ОТ ДАДЕНИЯ ИНДЕКС ЩОМ Е ВАЛИДЕН ^^
                    // иначе дава грешка/exception !!!!!!
                    numbers.remove(indexForRemove);
                } else {
                    //В случай, че имаме невалиден индекс!!!!!!!!
                    //невалиден индекс!!!!!!!!
                    System.out.println("Invalid index");
                }


            } else if (command.contains("Shift left")) {
                // command = "Shift left {count}"
                // command = "Shift left 5.split(" ") -> ["Shift", "left", "5"]"
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]); //"5" -> parse -> 5
                //повтаряме нещо -> count на брой пъти
                for (int time = 1; time <= countShiftLeft; time++) {
                    //first number becomes last
                    //{1, 23, 29, 18, 43, 21, 20}
                    //1.взимам кое е първото число
                    int firstNumber = numbers.get(0); //0 индекс -> първото число в списъка
                    //2. премахвам първото число от списъка
                    numbers.remove(0);  //{23, 29, 18, 43, 21, 20}
                    //3. добавям го на края на списъка
                    numbers.add(firstNumber); //{23, 29, 18, 43, 21, 20, 1}
                    //ЛЕСНО И ПРОСТО, НАЛИ????????
                }

            } else if (command.contains("Shift right")) {
                //command = "Shift right {count}"
                //command = "Shift right 4".split(" ") -> ["Shift", "right", "4"]
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]); //"4" -> 4
                for (int time = 1; time <= countShiftRight; time++) {
                    //last number becomes first times
                    //numbers = {23, 29, 18, 43, 21, 20, 123}
                    //1. взимам последното число от списъка
                    int lastNumber = numbers.get(numbers.size() - 1);
                    //2. премахвам последното число от списъка
                    numbers.remove(numbers.size() -1);
                    //3. вмъквам последното число на първо място
                    numbers.add(0, lastNumber);// на първия индекс т.е нулевия, добавяме последното число
                    //{23, 29, 18, 43, 21, 20, 123} стана
                    //{123, 29, 18, 43, 21, 20}
                }
            }
            command = sc.nextLine();
        }
        //1-вия начин -> с цикъл
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        /*
        2-рия начин -> без цикъл е следния:
        :D
        System.out.println(numbers.toString() //"[23, 29, 18, 43, 21, 20]"
        .replace("[", "") заменяме лявата скоба с нищо
        .replace("]", "") заменяме лявата скоба с нищо
        .replace(",", "") заменяме запетайката с нищо
         */

    }
}
