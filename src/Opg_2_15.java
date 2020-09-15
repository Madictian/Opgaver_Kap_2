import java.util.Scanner;

public class Opg_2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("start: ");
        System.out.println("stop: ");
        double point_start = input.nextDouble();
        double point_end = input.nextDouble();

        System.out.print("start: ");
        System.out.println("stop: ");
        double point2_start = input.nextDouble();
        double point2_end = input.nextDouble();

        double distance = Math.sqrt(Math.pow((point_end - point_start),2) + Math.pow((point2_end - point2_start), 2));
        System.out.println(distance + " meters per second");
    }
}
