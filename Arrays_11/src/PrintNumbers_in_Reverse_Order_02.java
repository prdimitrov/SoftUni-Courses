import java.util.Scanner;
public class PrintNumbers_in_Reverse_Order_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Прочитане на низ (n реда от integers)
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        //принтиране на елементите от последния до първия
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}