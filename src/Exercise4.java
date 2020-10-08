import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputLetterGrade = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String fullGrade = inputLetterGrade.nextLine();
        inputLetterGrade.close();
        String grade = fullGrade.substring(0,1);
        int length = fullGrade.length();
        double numGrade = 0.00;
        switch (grade){
            case "A":
                numGrade = 4.00;
                break;
            case "B":
                numGrade = 3.00;
                break;
            case "C":
                numGrade = 2.00;
                break;
            case "D":
                numGrade = 1.00;
                break;
            case "F":
                numGrade = 0.00;
                break;
        }

        boolean plusOrMinus = false;
        if(fullGrade.substring(1,length).equals("+") || fullGrade.substring(1,length).equals("-")){
            plusOrMinus = true;
        }
        if(plusOrMinus && grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D")){
            if(fullGrade.substring(1, length).equals("+")){
                if(grade.equals("B") || grade.equals("C") || grade.equals("D")) {
                    numGrade += 0.33;
                }
            }
             if(fullGrade.substring(1, length).equals("-")){
                numGrade-= 0.33;
            }
        }
        System.out.print("\nYour GPA is ");
        System.out.printf("%,.2f", numGrade);
        System.out.println(".");
    }
}
