
public class Card
{


    private char suit;
    private int value;
//default for card
    private Card() {

        suit = ' ';
        value = 0;


    }
//makes the 4 suits for the cards
    public Card(char newSuit, int newValue) throws InvalidCardValueException, InvalidCardSuitException {
        if (newValue < 1 || newValue > 13) {
            throw new InvalidCardValueException(newValue);
        } else {

            this.value = newValue;
        }
        if (newSuit != 'H' && newSuit != 'S' && newSuit != 'D' && newSuit != 'C') {
            throw new InvalidCardSuitException(newSuit);
        } else {
            this.suit = newSuit;
        }

    }

//will get number from suit like a king of hearts
    public String toString() {

        return getSuitName() + " " + this.value;

    }
//labels the cards as one of the 4 suits
    public String getSuitName() {

        String suit;

        if (this.suit == 'H') {

            suit = "Hearts";

        }
        else if (this.suit == 'S') {

            suit = "Spades";

        }
        else if (this.suit == 'C') {

            suit = "Clubs";

        }
        else if (this.suit == 'D') {

            suit = "Diamonds";

        } else {

            suit = "Unknown";
        }

        return suit;
//gets the suit
    }
    public char getSuitDesignator() {

        return suit;
//gets assign the card name with their values
    }
    public String getValueName(){

        String name = "Unknown";

        if (this.value == 1) {
            name = "Ace";
        }
        else if (this.value == 2) {
            name = "Two";
        }
        else if (this.value == 3) {
            name = "Three";
        }
        else if (this.value == 4) {
            name = "Four";
        }
        else if (this.value == 5) {
            name = "Five";
        }
        else if (this.value == 6) {
            name = "Six";
        }
        else if (this.value == 7) {
            name = "Seven";
        }
        else if (this.value == 8) {
            name = "Eight";
        }
        else if (this.value == 9) {

            name = "Nine";
        }
        else if (this.value == 10) {

            name = "Ten";
        }
        else if (this.value == 11) {

            name = "Jack";
        }
        else if (this.value == 12) {

            name = "Queen";
        }
        else if (this.value == 13) {

            name = "King";

        }
        return name;

    }

//gets the value of card
    public int getValue() {

        return this.value;
    }

//compares the card suits
    public boolean compareSuit(Card card){

        return this.suit == card.getSuitDesignator();

    }
//compares the card values
    public boolean compareValue(Card card){

        return this.value == card.getValue();
    }
//compares both the card value and suit
    public boolean compareTo(Card card){

        return this.suit == card.getSuitDesignator() && this.value == card.getValue();
    }


}