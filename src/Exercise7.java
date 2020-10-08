import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner yearInput = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = yearInput.nextInt();
        yearInput.close();
        //determine if it is a leap year
        boolean leapYear;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leapYear = true;
                }
                else{
                    leapYear = false;
                }
            }
            else {
                leapYear = true;
            }
        }
        else {
            leapYear = false;
        }

        //print
        if(leapYear == true && year/ Math.abs(year) == 1){
            System.out.println("\n" + year + " is a leap year.");
        }
        else if( leapYear == false && year/ Math.abs(year) == 1){
            System.out.println("\n" + year + " is not a leap year.");
        }
    }
}
