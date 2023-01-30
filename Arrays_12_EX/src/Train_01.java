import java.util.Scanner;
public class Train_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumPeople = 0;
        // You will be given a count of wagons in a train n.
        int n = Integer.parseInt(sc.nextLine());
        // On the next n lines, you will receive how many people will get on that wagon.
        int[] peopleOnWagon = new int[n];
        for (int i = 0; i < n; i++) {
            peopleOnWagon[i] = Integer.parseInt(sc.nextLine());
            sumPeople += peopleOnWagon[i];
        }
        // In the end, print the whole train and the sum of the people on the train
        for (int i = 0; i < n; i++) {
            System.out.print(peopleOnWagon[i] + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}