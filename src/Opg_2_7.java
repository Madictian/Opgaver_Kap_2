import java.util.Scanner;
public class Opg_2_7 {
    public static void main(String[] args) {

        int year = 525600;
        int day = 1440;
        Scanner input = new Scanner(System.in);
        System.out.println("giv mig minutter");
        int minutes = input.nextInt();
        int remainingMinutes = 0;
        int days =0;
        int years =0;

        if(minutes > year) {
                remainingMinutes = minutes % year;
                days = remainingMinutes / day;
                years = ((minutes - remainingMinutes) / year);
        }
        else if(minutes > day){
                days = minutes / day;
                remainingMinutes = minutes / day;
                int rest = day - remainingMinutes;


        }
        else{
            System.out.println("Can't be asked bro");
        }
        System.out.println(years + " years " + days +" days");
    }
}
