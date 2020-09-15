import java.util.Scanner;

public class Opg_2_14 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("weight: ");
            System.out.println("height: ");

            double weight       = input.nextDouble();
            double weight_pound = weight * 0.45359237;
            double height       = input.nextDouble();
            double height_inches =  height * 0.0254;

            double BMI = (weight_pound /(height_inches * height_inches));
            System.out.println("is this good?? -> " + BMI + " don't think too hard about it");
    }
}
