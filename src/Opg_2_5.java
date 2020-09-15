import java.util.Scanner;

public class Opg_2_5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Subtotal ");
            double subTotal = input.nextDouble();
            double gratuity = input.nextDouble( );
            double total = (gratuity / 100 * subTotal) + subTotal;
            System.out.println("subtotal is " + subTotal + " + in gratuities " + gratuity +" total is " + total);
        }

}
