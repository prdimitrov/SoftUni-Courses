import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countCommands = Integer.parseInt(sc.nextLine()); // брой команди

        List<String> guests = new ArrayList<>(); //списък с имена на гостите

        for (int countCommand = 1; countCommand <= countCommands; countCommand++) {
            String command = sc.nextLine();
            //По-добре тука да си сложем името на гостите String name = command.split(" ")[0];

            /*
            може да кажем и if (command.contains("not") {

            }
            */
            if (command.contains("is going!")) {
                //command = "{name} is going!".split(" ") -> ["{}"]
                //command = "{Desi} is going!".split(" ") -> ["Desi", "is", "going!"]
                String name = command.split(" ")[0]; //[0]^^ нулевия елемент е Desi, човека който ще идва на партито.
                //1 вариант - да го има в списъка
                if (guests.contains(name)) {
                    System.out.println(name + " is already in the list");
                }
                //2 вариант - да го няма в списъка
                else {
                    guests.add(name); // добавяме го в списъка, ако го няма.
                }

            } else if (command.contains("is not going!")) {
                //command = "{name} is not going!"
                //command = "Ivan is not going!".split(" ") -> ["Ivan", "is", "not", "going!"]
                String name = command.split(" ")[0]; // кой е човекът, който няма да идва на партито

                //1 вариант - ако го има в списъка -> премахвам
                if (guests.contains(name)) {
                    guests.remove(name);
                }
                //2 вариант - ако го няма в списъка
                else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        //пълния списък с гостите, отпечатваме ИЗВЪН for цикъла
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
