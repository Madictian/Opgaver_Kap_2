import java.util.Scanner;
public class Opg_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("length: ");
        double length = input.nextDouble();
        double areal    = (Math.sqrt(3) / 4) * (length*length);
        System.out.println("Arealet af trekanten er " + areal);
        double vol      = areal * length;
        System.out.println("trekantens massefylde er " + vol);
    }
}
