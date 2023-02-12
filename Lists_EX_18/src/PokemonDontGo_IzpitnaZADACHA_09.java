import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_IzpitnaZADACHA_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList()); // {4, 5, 3}

        //повтаряме: въвеждаме индекс
        //стоп: когато нямаме елементи в списъка (size <= 0)
        //продължаваме: когато имаме елементи в списъка (size > 0)

        int sum = 0; // сума на премахнатите лементи

        while (numbers.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            //1 вариант - index < 0
            if (index < 0) {
                //{8, 5, 3, 6, 7, 8}
                //1. ТРЯБВА ДА СИ ВЗИМАМ КОЙ МИ Е ПЪРВИЯ ЕЛЕМЕНТ ОТ СПИСЪКА
                //И Какво? Трябва просто да взема първия елемент от списъка, да го премахна и да го сложа НА ПОСЛЕДНО МЯСТО (т.е най-отзад)
                //трябва да се има на предвид, че може да се въведе отрицателен индекс, което не е окей..
                int firstElement = numbers.get(0);
                //2. ПРЕМАХВАМ ЕЛЕМЕНТА ОТ ПЪРВОТО МЯСТО -> СУМИРАНЕ
                numbers.remove(0);
                sum += firstElement;
                //3. ВЗИМАМ КОЙ МИ Е ПОСЛЕДНИЯ ЕЛЕМЕНТ В СПИСЪКА (ПИШЕ COPY the last element)
                int lastElement = numbers.get(numbers.size() - 1);
                //4. СЛАГАМ ПОСЛЕДНИЯ ЕЛЕМЕНТ НА ПЪРВО МЯСТО
                numbers.add(0, lastElement);
                //5. МОДИФИЦИРАМ СПИСЪКА, СПРЯМО ПРЕМАХНАТИЯ ЕЛЕМЕНТ
                //ИЗПОЛЗВАМ modifyList метода, който създадох "ПО-РАНО", малко по-долу в кода!!!!
                modifyList(numbers, firstElement);
            }
            //2 вариант - index > последния индекс в списъка
            else if (index > numbers.size() - 1) {
                //1. ВЗИМАМ ПОСЛЕДНИЯ ЕЛЕМЕНТ
                int lastElement = numbers.get(numbers.size() - 1);
                //2. ПРЕМАХВАМ ПОСЛЕДНИЯ ЕЛЕМЕНТ
                numbers.remove(numbers.size() - 1);
                sum += lastElement;
                //3. ВЗИМАМ ПЪРВИЯ ЕЛЕМЕНТ
                int firstElement = numbers.get(0);
                //4. ВМЪКВАМ ПЪРВИЯ ЕЛЕМЕНТ НА ПОСЛЕДНО МЯСТО В СПИСЪКА
                numbers.add(firstElement); //
                //5. МОДИФИЦИРАМ СПИСЪКА СПРЯМО ПРЕМАХНАТИЯ ЕЛЕМЕНТ
                // за последен път използвам този метод.. писна ми :D
                modifyList(numbers, lastElement);
            }
            //3 вариант - index да е валиден -> index >= 0 и index <= последния
            else if (index >= 0 && index <= numbers.size() - 1) {
                //1. ВЗИМАМ КОЙ Е ЕЛЕМЕНТА НА ДАДЕНИЯ ИНДЕКС
                int removedNumber = numbers.get(index); //първо сме взели елемента
                sum += removedNumber;
                //2. ПРЕМАХВАМ ЕЛЕМЕНТА НА ДАДЕНИЯ ИНДЕКС
                numbers.remove(index); //после сме го премахнали от списъка
                //3. МОДИФИЦИРАМ СПИСЪКА СПРЯМО ПРЕМАХНАТОТО ЧИСЛО
                // ВАЛИДНИЯ ИНДЕКС!! т.е index >= 0 и (&&) index <= дължината на numbers, какво го правим?
                // ЕЙ СЕГА ЩЕ ВИДИШ
                modifyList(numbers, removedNumber);
                //ALT + ENTER, защото ModifyList първоначално свети в червено
                //Т.Е СЪЗДАВАМЕ СИ КЛАС modifyList
            }
        }
        System.out.println(sum);
    }
    private static void modifyList(List<Integer> numbers, int removedNumber) {
        for (int index = 0; index <= numbers.size() - 1; index++) {
            int currentElement = numbers.get(index); //ТЕКУЩ ЕЛЕМЕНТ
            if (currentElement <= removedNumber) {
                currentElement += removedNumber;
            } else {
                currentElement -= removedNumber;
            }

            numbers.set(index, currentElement);

        }
    }
}
