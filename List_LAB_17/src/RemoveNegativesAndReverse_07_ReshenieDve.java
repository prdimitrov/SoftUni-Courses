import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07_ReshenieDve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //ей това тука ни помага за второто решение, трябва да се пробва
        numbers.removeIf(number -> number < 0);
        //-> е ламбда израз !!!!!!!!!!

        /*
        List<Integer> positiveNumbers = new ArrayList<>(); //списък в който ще има само положителни числа

        for (int number:numbers) {
            if (number >= 0) {
                positiveNumbers.add(number);
            }

        }
        Collections.reverse(positiveNumbers);
        if (positiveNumbers.size() == 0) {
            System.out.println("empty");
        } else {
            System.out.println(positiveNumbers.toString().replace("[", "")
                    .replace("]", "")
                    .replaceAll(",", ""));
        }
         */

        /*
        Друг начин
        for (int number : positiveNumbers) {
        sout(number + " ")
        }
         */
    }
}
