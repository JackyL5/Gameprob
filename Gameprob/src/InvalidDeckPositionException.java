public class InvalidDeckPositionException extends Exception {

    private int positionIdentifier = 0;

    public InvalidDeckPositionException(int inValidPosition) {

        positionIdentifier = inValidPosition;

        System.out.println("Invalid Position" + inValidPosition);

    }

    private InvalidDeckPositionException() {
        System.out.println("Invalid Position");
    }

    public String toString() {

        return ("card from position not in Deck" + " " + this.positionIdentifier);
    }

    public int getPositionValue() {
        return positionIdentifier;
    }
} //End class