import java.util.Scanner;
public class Opg_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how much?: ");
        int maaned = input.nextInt();
        double interest_month = ((3.75 / 100) / 12);
        double account = 0;

        for (int x = 1; x <= 6; x++) {
            account = (account + maaned) * (1 + interest_month);

            System.out.println("efter " + x + " månedder har du " + account + " Dollar");
        }
    }
}
