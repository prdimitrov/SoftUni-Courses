import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. входни данни -> 2 цели числа
        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        //2. факториел на първото число
        long fact1 = calculateFactorial(number1); //факториел на 1-вото число
        //3. факториел на второто число
        long fact2 = calculateFactorial(number2); //факториел на 2-рото число
        //4. ф1 / ф2 -> принт резултата
        double divisionFactorials = fact1 * 1.0 / fact2;
        //умножаваме едното от двете * 1.0
        //за да получим дробен резултат
        System.out.printf("%.2f", divisionFactorials);

    }

    //метод, който връща резултат (факториела на дадено число)
    public static long calculateFactorial(int number) {
        //number = 5
        //5! = 1 * 2 * 3 * 4 * 5
        long fact = 1; //стойността на факториел
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
