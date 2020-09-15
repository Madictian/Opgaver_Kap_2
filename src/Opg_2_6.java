import java.util.Scanner;
public class Opg_2_6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("integer (0 - 1000): ");
        int integer = input.nextInt();
        int result = 0;

        if (!(integer >= 1000 || integer <=0)){

            if (integer >= 100) {

                result = integer % 10 * ((integer / 10) % 10) * ((integer / 100) % 10);

            }

            else if (integer > 10 && 100 > integer) {

                result = integer % 10 * ((integer / 10));

            }


            else if (integer < 10) {

                result = integer;

            }

        System.out.println(result);
            }
         else{
            System.out.println("Error, number is not between 1k and 0");
        }
        }
    }