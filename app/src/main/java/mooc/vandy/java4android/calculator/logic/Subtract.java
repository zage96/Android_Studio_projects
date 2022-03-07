package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    /*
     * Create the variables for the class
     * */
    private int firstNumber;        // Minuend
    private int secondNumber;       // Subtrahend
    private long solution;          // Difference

    /*
     * Basic constructor
     */
    public Subtract(){
        setFirst(0);
        setSecond(0);
        solution = 0;
    }

    /*
     * Constructor with one parameter
     * Minuend
     * */
    public Subtract(int first){
        this();
        setFirst(first);
    }

    /*
     * Constructor with two parameters
     * Minuend
     * Subtrahend
     * */
    public Subtract(int first, int second){
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
     * Function that performs the operation = subtraction
     * it subtracts the second element to the first one and
     * sets that value the solution variable
     *
     * */
    public void performSub(){
        solution = getFirst() - getSecond();
        return;
    }

    /*
     * Function that returns the value of the solution of the operation
     * */
    public long getSolution(){
        return solution;
    }

    /*
     * Function that returns a String withe the respective solution of
     * the operation
     *
     * */
    public String printSolution(){
        //Verify if there is an overflow
        if(firstNumber > 0 && secondNumber <0){
            if(solution <0)
                return "OVERFLOW";
        }

        return (String.format("%d", getSolution()));
    }
}
