public class InvalidCardValueException extends Exception
{
    private int valueIdentifier = 0;
// say value no work
    public InvalidCardValueException(int invalidValue) {

        valueIdentifier = invalidValue;

        System.out.println("Invalid value " + invalidValue);
    }
//say value no work
    private InvalidCardValueException() {


        System.out.println("Invalid value");
    }

    public String toString() {


        return (" card invalid suit argument" + " " + this.valueIdentifier);
    }

    public int getValue() {

        return valueIdentifier;
    }

}