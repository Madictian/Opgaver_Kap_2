import java.util.Scanner;

public class Opg_2_11 {
    public static void main(String[] args) {
// nuværende befolkningstal
        Scanner input = new Scanner(System.in);
        System.out.println("how many years?: ");
        int aar = input.nextInt();
        int currentPopulation = 312032386;

        for (int x = 1; x <= aar; x++)
        //danner et for loop som kører formerings loop igen op til 5 år
        {
            for (int i = 1; i <= (365 * 24 * 60 * 60); i++)
            //danner grunlag for den sekund pøl som modulus kan tage af
            {
                if (i % 7 == 0) {
                    currentPopulation += 1;
                    // regner formering
                }
                if (i % 13 == 0) {
                    currentPopulation -= 1;
                    // regner afdøde
                }
                if (i % 45 == 0) {
                    currentPopulation += 1;
                    // regner indvandring
                }

            }
            System.out.println("Nuværende befolkning (i år " + x + "efter begyndelses året) = " + currentPopulation);
        }
    }
}

