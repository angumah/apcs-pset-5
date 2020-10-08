import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputInteger = new Scanner(System.in);
        System.out.println("Enter three integers.");
        //get integers
        System.out.print("\nEnter integer 1: ");
        int firstInteger = inputInteger.nextInt();
        System.out.print("Enter integer 2: ");
        int secondInteger = inputInteger.nextInt();
        System.out.print("Enter integer 3: ");
        int thirdInteger = inputInteger.nextInt();
        inputInteger.close();

        if (secondInteger >  firstInteger && thirdInteger > secondInteger){
                System.out.println("\nStrictly increasing.");
        }
        else if (secondInteger < firstInteger && thirdInteger < secondInteger){
            System.out.println("\nStrictly decreasing");
        }
        else if (secondInteger == firstInteger && thirdInteger == secondInteger){
            System.out.println("\nSame");
        }
        else {
            System.out.println("\nUnordered");
        }

    }
}
