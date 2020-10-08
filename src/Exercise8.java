import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        //initialize Scanner
        Scanner inputTemperature = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String temperature = inputTemperature.nextLine();
        inputTemperature.close();

        int length = temperature.length();
        String tempNum = temperature.substring(0, length-2);
        int temp = Integer.valueOf(tempNum);

        String scale = temperature.substring(length-1, length);
        String state = null;
        if(scale.equalsIgnoreCase("C")){
            if(temp <= 0){
                state = "Solid";
            }
            else if(temp > 0 && temp <= 100){
                state = "Liquid";
            }
            else {
                state = "Gas";
            }
        }
        else if(scale.equalsIgnoreCase("F")){
            if(temp <= 32){
                state = "Solid";
            }
            else if(temp > 32 && temp <= 212 ){
                state = "Liquid";
            }
            else{
                state = "Gas";
            }
        }


        if(state != null){
            System.out.println("\n" + state + ".");
        }
        else{
            System.out.println("\nThat's not a valid scale.");
        }

    }
}
