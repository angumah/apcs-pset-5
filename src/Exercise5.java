import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputGrade = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        double grade = inputGrade.nextDouble();
        inputGrade.close();
        //round grade
        grade = (int) (grade + 0.5);

        //find letter grade
        String letterGrade;
        if(grade >= 90 && grade <= 100){
            letterGrade = "A";
        }
        else if(grade >= 80 && grade < 90){
            letterGrade = "B";
        }
        else if(grade >= 70 && grade < 80){
            letterGrade = "C";
        }
        else if(grade >= 60 && grade < 70){
            letterGrade = "D";
        }
        else if(grade < 60 && grade >=0){
            letterGrade = "F";
        }
        else{
            letterGrade = null;
        }
        if(letterGrade == "A"){
            System.out.println("\nYou received an " + letterGrade + ".");
        }
        else if (letterGrade == null && grade > 100) {
            System.out.println("\nGrades above 100 are invalid");
        }
        else if (letterGrade == null && grade < 0){
            System.out.println("\nGrades below 0 are invalid");
        }
        else {
            System.out.println("\nYou received a " + letterGrade + ".");
        }
    }
}
