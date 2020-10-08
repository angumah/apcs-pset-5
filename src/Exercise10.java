import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        //initialize scanners
        Scanner inputWage = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = inputWage.nextDouble();


        Scanner inputHours = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        int hours = inputHours.nextInt();

        inputWage.close();
        inputHours.close();

        //calculate salary;
        int excessRate = (hours - 40);
        double salary = 0;
        if(excessRate > 0) {
            salary = (wage*40);
            salary += (1.5*wage * excessRate);
        }
        else{
            salary = wage * hours;
        }

        if(salary < 0){
            if(wage < 0){
                System.out.println("Your wage must be greater than or equal to $0.00/hour.");
            }
            else if(hours < 0){
                System.out.println("Your hours must be greater than or equal to 0.0.");

            }
        }
        else{
            System.out.print("\nYou'll make $");
            System.out.printf("%,.2f", salary);
            System.out.println(" this week.");
        }
    }
}
