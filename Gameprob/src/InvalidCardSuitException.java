public class InvalidCardSuitException extends Exception {

    private char suitIdentifier = '?';
//card suits that don't work
    public InvalidCardSuitException(char invalidSuit) {

        suitIdentifier = invalidSuit;

        System.out.println("Invalid suit" + " " + invalidSuit);
    }
//card suits that don't work
    private InvalidCardSuitException() {
        System.out.println("Invalid suit");
    }

    public String toString(){

        return ("Attempted to create card with invalid suit argument" + " " + this.suitIdentifier);

    }
// the suit
    public char getSuitDesignator() {

        return suitIdentifier;
    }
}