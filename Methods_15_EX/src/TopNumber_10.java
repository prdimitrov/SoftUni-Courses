import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int number = 1; number < n; number++) {
            //проверка дали е топ число
            //1. сумата на цифрите да се дели на 8
            //2. съдържа поне една нечетна цифра
            if (isSumOfDigitsIsDivisibleBy8(number) && isContainsOddDigit(number)) {
                //отпечатваме числото
                System.out.println(number);
            }


        }
    }

    //метод, който проверява дали сумата от цифрите на числото се дели на 8
    //метода очакваме да върне -> true, ако се дели на 8
    //очакваме false, ако сумата не се дели на 8
    public static boolean isSumOfDigitsIsDivisibleBy8(int number) {
        //1. сумата от цифрите на числото
        int sum = 0; //сума от цифрите
        while (number > 0) {
            int lastDigit = number % 10; //така заимаме последната цифра на числото
            sum += lastDigit; //сумираме последната цифра
            number = number / 10; // премахваме последната цифра
        }
        //2. проверка дали сумата от цифрите се дели на 8
        return sum % 8 == 0;
        /*
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
         */
    }

    //метод, който проверява дали имаме поне една нечетна цифра
    //true -> ако имаме поне една нечетна цифра
    //false -> ако нямаме нито една нечетна цифра
    public static boolean isContainsOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10; //взимаме последната цифра
            //проверявам дали цифрата е нечетна
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        //проверили сме всички цифри и никоя не е била нечетна
        return false;
    }
}