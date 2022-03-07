package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    /*
    * Create the variables for the class
    * */
    private int firstNumber;        // first addend
    private int secondNumber;       // second addend
    private long solution;          // sum


    /*
    * Basic constructor
    */
    public Add(){
        setFirst(0);
        setSecond(0);
        solution = 0;
    }

    /*
    * Constructor with one parameter
    * first addend
    * */
    public Add(int first){
        this();
        setFirst(first);
    }

    /*
     * Constructor with two parameters
     * first addend
     * second addend
     * */
    public Add(int first, int second){
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
     * Function that performs the operation = addition
     * it adds the first element with the second one and
     * sets that value the solution variable
     *
     * */
    public void performAddition(){
        solution = getFirst() + getSecond();
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
        if(firstNumber > 0 && secondNumber >0){
            if(solution < firstNumber || solution < secondNumber)
                return "OVERFLOW";
        }

        return (String.format("%d", getSolution()));
    }

}
