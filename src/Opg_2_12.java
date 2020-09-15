import java.util.Scanner;

public class Opg_2_12 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Velocity : ");
            System.out.println("acceleration: ");

            double Vel  = input.nextDouble();
            double acceleration  = input.nextDouble();

            double lenght = ((Vel * Vel) / (acceleration * 2));
            System.out.println("how long is enough? -> " + lenght + " is enough");
}
}