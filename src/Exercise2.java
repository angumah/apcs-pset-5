import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = integerInput.nextInt();
        integerInput.close();
        if(userInt % 2 == 0){
            System.out.print("\nEven.");
        } else {
            System.out.print("\nOdd.");
        }
    }
}
