import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstRow = sc.nextLine();
        String secondRow = sc.nextLine();

        String[] firstArray = firstRow.split(" ");
        String[] secondArray = secondRow.split(" ");
            //обхождам всички елементи на втория масив
        for (String secondElement : secondArray) {
            //какво повтарям за всеки елемент от втория масив: обхождам първия масив
            for (String firstElement: firstArray) {
                if (secondElement.equals(firstElement)) {
                    //общ елемент в двата масива
                    System.out.println(firstElement + " ");
                    break;
                }
            }
        }
    }
}
