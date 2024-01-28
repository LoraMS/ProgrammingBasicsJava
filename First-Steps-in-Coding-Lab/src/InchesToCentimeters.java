import java.util.Scanner;
public class InchesToCentimeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        s=s*2.54;
        System.out.println(s);
    }
}
