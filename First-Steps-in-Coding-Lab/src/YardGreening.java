import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size = scanner.nextDouble();
        double priceSingle = 7.61;
        double discountPercent = 0.18;
        double priceAll = size*priceSingle;
        double discount = priceAll*discountPercent;
        double finalPrice = priceAll-discount;
        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.print("/n");
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
