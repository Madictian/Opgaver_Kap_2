import java.util.Scanner;
public class Opg_2_9 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Velocity 1: m/s");
    System.out.print("Velocity 2: m/s");
    System.out.println("And how long did it take?: seconds");

    double Vel0  = input.nextInt();
    double Vel1  = input.nextInt();
    double time    = input.nextInt();

    double acceleration = ((Vel1 - Vel0) / time);
        System.out.println("fast as fuck" + acceleration + "m/s^2");



}
}
