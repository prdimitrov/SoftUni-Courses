import java.util.Scanner;

public class TreasureHunt_10_Desi_Ima_Da_q_Doobqsnqva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] loots = sc.nextLine().split("\\|");
        //слагаме \\ преди правата черта, за да използва чертата
        //като символ, а не като оператор
        //"Gold|Silver|Bronze|Medallion|Cup".split("|") -> ["Gold", "Silver", "Bronze", "Medallion", "Cup"]
        String command = sc.nextLine(); //цялата команда, въведена от конзолата

        while (!command.equals("Yohoho!")) {
            //command = "Loot {item1} {item2}...{itemn}".split -> ["Loot", "item1", "item2", ...]
            //command = "Drop 4".split -> ["Drop", "4"]
            //command = "Steal 2".split -> ["Steal", "2"]
            String[] commandParts = command.split(" "); //частите на командата
            String commandName = commandParts[0]; //име на команда: Loot, Drop, Steal

            switch (commandName) {
                case "Loot":

                    break;
                case "Drop":
//command = "Drop 4".split -> ["Drop", "4"]
                    int dropIndex = Integer.parseInt(commandParts[1]); //"4" -> 4
                    //проверка на индекса
                    if (dropIndex < 0 || dropIndex >= loots.length - 1) {
                        //невалиден индекс -> индекс, на който нямаме елемент
                        break;
                    } else {
                        //валиден индекс
                        //1. взимаме елемента за преместване
                        String currentLoot = loots[dropIndex];
                        //2. премествам на ляво всички елементи след моя
                        for (int leftIndex = dropIndex; leftIndex < leftIndex - 1; leftIndex++) {
                            loots[leftIndex] = loots[leftIndex + 1];
                        }
                        //3. слагаме накрая елемента за преместване
                        loots[loots.length - 1] = currentLoot;
                    }
                    break;
                case "Steal":

                    break;
            }
            command = sc.nextLine();
        }

    }
}
