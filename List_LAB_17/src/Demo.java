import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());

        //РАБОТИ САМО ЗА СПИСЪК ОТ STRINGове
        System.out.println(String.join(",", names));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 6, 12, 34, 56, 87));
        System.out.println(numbers.toString().replace("[", "")
                .replace("]", ""));
        //пишем го този replace, защото ще ми отпечата иначе [5, 6, 12, 34, 56, 87]
        //просто отпечатва нищо, вместо "[" и "]"

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(5, 6, 12, 34, 56, 87));
        Collections.sort(numbers);

        //sort сортира елементите в списъка в нарастващ ред (ascending order)
        //списък от числа -> най-малкото към най-голямото
        //списък от текста -> азбучен ред
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(52, -5, 124, 4, 56, 17));
        Collections.sort(numbers);

        //когато искаме в намаляващ ред (descending order)
        //от най-голямото към най-малкото

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(52, -5, 124, 4, 56, 17));
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers.toString());
    }
}
