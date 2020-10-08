import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        //initialize scanner
        Scanner inputCard = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        //set suit and card
        String userCard = inputCard.nextLine();
        inputCard.close();
        // set card parameters
        int length = userCard.length();
        String suit = userCard.substring(1, length);
        String cardName;
        //set suit
        switch (suit){
            case "S":
                suit = "Spades";
                break;
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            default:
                suit = null;
        }
        //set number
        String cardNum = userCard.substring(0,1);
            switch (cardNum){
                case "2":
                    cardName = "Two";
                    break;
                case "3":
                    cardName = "Three";
                    break;
                case "4":
                    cardName = "Four";
                    break;
                case "5":
                    cardName = "Five";
                    break;
                case "6":
                    cardName = "Six";
                    break;
                case "7":
                    cardName = "Seven";
                    break;
                case "8":
                    cardName = "Eight";
                    break;
                case "9":
                    cardName = "Nine";
                    break;
                case "T":
                    cardName = "Ten";
                    break;
                case "J":
                    cardName = "Jack";
                    break;
                case "Q":
                    cardName = "Queen";
                    break;
                case "K":
                    cardName = "King";
                    break;
                case "A":
                    cardName = "Ace";
                    break;
                default:
                    cardName = null;
            }
        if(cardName != null && suit != null){
            System.out.println("\n" + cardName + " of " + suit+".");
        }
        else{
            if(cardName == null){
                System.out.println("\nThat's not a valid rank.");
            }
            else if(suit == null){
                System.out.println("\nThat's not a valid suit.");
            }
        }
    }
}
