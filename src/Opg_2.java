import java.util.Scanner;
public class Opg_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv antal miles");
        double mile = input.nextDouble( );
        double km = 1.6;
        double conversion_to_mile = mile * km;
        System.out.println(mile +" mil = " + conversion_to_mile + " km");
    }
}
// Scanner beder brugeren om at skrive et antal mil som derefter bliver konverteret.