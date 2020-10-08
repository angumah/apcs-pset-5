import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = integerInput.nextInt();
        integerInput.close();

        double userDouble = (userInt);

        if(userDouble/Math.abs(userInt) == 1){
            System.out.println("\nPositive.");
        }
        else if(userDouble/Math.abs(userInt) == -1){
            System.out.println("\nNegative.");
        }
        else {
            System.out.println("\nZero.");
        }
    }
}
