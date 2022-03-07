package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */

    /*
    * Create the static final variables that will define each operation
    * */
    protected ActivityInterface mOut;
    public static final int ADD = 1;
    public static final int SUBTRACT = 2;
    public static final int MULTIPLY = 3;
    public static final int DIVIDE = 4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        switch (operation){
            case ADD:
                // Create the object
                Add currentAddition = new Add(argumentOne,argumentTwo);
                //Perform the operation
                currentAddition.performAddition();
                //Show the solution of the operation
                mOut.print(currentAddition.printSolution());
                break;
            case SUBTRACT:
                // Create the object
                Subtract currentSub = new Subtract(argumentOne,argumentTwo);
                //Perform the operation
                currentSub.performSub();
                //Show the solution of the operation
                mOut.print(currentSub.printSolution());
                break;
            case MULTIPLY:
                // Create the object
                Multiply currentMult = new Multiply(argumentOne,argumentTwo);
                //Perform the operation
                currentMult.performMult();
                //Show the solution of the operation
                mOut.print(currentMult.printSolution());
                break;
            case DIVIDE:
                // Create the object
                Divide currentDiv = new Divide(argumentOne,argumentTwo);
                //Perform the operation
                currentDiv.performDiv();
                //Show the solution of the operation
                mOut.print(currentDiv.printSolution());
                break;
            default:
                // Print an exception in case a non recognized operation is obtained
                mOut.print("No operation to be done");
                break;
        }
    }
}
