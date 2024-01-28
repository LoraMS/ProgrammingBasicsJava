import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsFoodQuantity = Integer.parseInt(scanner.nextLine());
        int catsFoodQuantity = Integer.parseInt(scanner.nextLine());
        double dogsFoodPrice = 2.50;
        double catsFoodPrice = 4;
        double dogsFoodAmount = dogsFoodQuantity * dogsFoodPrice;
        double catsFoodAmount = catsFoodQuantity * catsFoodPrice;
        double foodAmount = dogsFoodAmount + catsFoodAmount;
        System.out.printf("%.2f lv.", foodAmount);
    }
}
