import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); //брой на продуктите
        List<String> products = new ArrayList<>(); // списък с продуктите

        for (int i = 0; i < n; i++) {
            String product = sc.nextLine(); //име на продукта
            products.add(product);
        }
        Collections.sort(products);
        //sort (списък от текстове) -> в нарастващ (азбучен) ред (a -> z)

        int number = 1;
        for (String product : products) {
            System.out.println(number + "." + product);
            number++;
        }
    }
}
