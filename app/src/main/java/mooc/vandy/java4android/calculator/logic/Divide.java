package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    /*
     * Create the variables for the class
     * */
    private int firstNumber;            // Dividend
    private int secondNumber;           // Divisor
    private int solution;               // Quotient
    private int remainder;              // Remainder

    /*
     * Basic constructor
     */
    public Divide(){
        setFirst(0);
        setSecond(0);
        solution = 0;
        solution = 0;
    }

    /*
     * Constructor with one parameter
     * */
    public Divide(int first){
        this();
        setFirst(first);
    }

    /*
     * Constructor with two parameters
     * Dividend
     * Divisor
     * */
    public Divide(int first, int second){
        this();
        setFirst(first);
        setSecond(second);
    }

    /*
     * Function that sets a value to the first element of the operation
     * */
    public void setFirst(int first){
        firstNumber = first;
        return;
    }

    /*
     * Function that sets a value to the second element of the operation
     * */
    public void setSecond(int second){
        secondNumber = second;
        return;
    }

    /*
     * Function that returns the value of the first element of the operation
     * */
    public int getFirst(){
        return firstNumber;
    }

    /*
     * Function that returns the value of the second element of the operation
     * */
    public  int getSecond(){
        return secondNumber;
    }

    /*
     * Function that performs the operation = division
     * it divides the first element with the second one and
     * sets the quotient value the solution variable and the
     * remainder value to the remainder variable
     * */
    public void performDiv(){
        if(getSecond() !=0){
            solution = getFirst() / getSecond();
            remainder = getFirst() % getSecond();
        }
        return;
    }

    /*
     * Function that returns the value of the solution of the operation
     * in this case, it obtains the quotient
     * */
    public int getSolution(){
        return solution;
    }

    /*
     * Function that returns the value of the remainder of the operation
     * */
    public int getRemainder(){
        return  remainder;
    }

    /*
     * Function that returns a String withe the respective solution of
     * the operation
     * The format has the Quotient first, then the remainder being separated
     * by an "R:"
     * */
    public String printSolution(){
        if(getSecond() !=0)
            return (String.format("%d", getSolution())+" R: "+String.format("%d", getRemainder()));
        else
            return ("Invalid Operation");
    }
}
