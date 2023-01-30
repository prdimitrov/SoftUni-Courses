import java.util.Scanner;

public class Zig_Zag_Arrays_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program that creates 2 arrays.
        int n = Integer.parseInt(sc.nextLine());
        // You will be given an integer n. On the next n lines, you get 2 integers.
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            String[] currentNum = sc.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(currentNum[0]);
                secondArr[i] = Integer.parseInt(currentNum[1]);
            } else {
                firstArr[i] = Integer.parseInt(currentNum[1]);
                secondArr[i] = Integer.parseInt(currentNum[0]);
            }
        }
        // Form 2 arrays as shown below.
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
