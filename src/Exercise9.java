import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputMonth = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = inputMonth.nextLine();
        inputMonth.close();

        int length = month.length();
        String days = null;
        if(length == 3) {
            if (month.equalsIgnoreCase("jan") || month.equalsIgnoreCase("mar") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("jul") || month.equalsIgnoreCase("aug") || month.equalsIgnoreCase("oct") || month.equalsIgnoreCase("dec")) {
                days = "31";
            } else if (month.equalsIgnoreCase("feb")) {
                days = "28 or 29";
            } else if (month.equalsIgnoreCase("apr") || month.equalsIgnoreCase("jun") || month.equalsIgnoreCase("sep") || month.equalsIgnoreCase("nov")) {
                days = "30";
            }
        }
        else if(length == 4){
            if (month.equalsIgnoreCase("janu") || month.equalsIgnoreCase("marc") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("augu") || month.equalsIgnoreCase("octo") || month.equalsIgnoreCase("dece")) {
                days = "31";
            } else if (month.equalsIgnoreCase("febr")) {
                days = "28 or 29";
            } else if (month.equalsIgnoreCase("apri") || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("sept") || month.equalsIgnoreCase("nove")) {
                days = "30";
            }
        }
        else{
            if (month.equalsIgnoreCase("january") || month.equalsIgnoreCase("march") || month.equalsIgnoreCase("may") || month.equalsIgnoreCase("july") || month.equalsIgnoreCase("august") || month.equalsIgnoreCase("october") || month.equalsIgnoreCase("december")) {
                days = "31";
            } else if (month.equalsIgnoreCase("february")) {
                days = "28 or 29";
            } else if (month.equalsIgnoreCase("april") || month.equalsIgnoreCase("june") || month.equalsIgnoreCase("september") || month.equalsIgnoreCase("november")) {
                days = "30";
            }
        }

        if(days != null){
            System.out.println("\n" + days + " days.");
        }
        else{
            System.out.println("\nThat's not a valid month");
        }
    }
}
