import java.util.Scanner;

public class Opg_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how much water: ");
        System.out.println("how cold was it?: ");
        System.out.println("how hot is it?: ");

        double Mass = input.nextInt();
        double temp0 = input.nextInt();
        double temp1 = input.nextInt();

        double Q = Mass * (temp1 - temp0) * 4184;
        System.out.println("ohh mama, that's hot as fuck " + Q + "Joule");
    }
}