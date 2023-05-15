
/**

This class is an implementation of the Computable interface which calculates the factorial of a given number.
The class receives input as a string array, sets it as an integer, and then calculates the factorial of the input number.
The result is then returned as a long type.
*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;

public class FactorialEngine implements Computable {
/**
* A static string that holds the name of the engine.
*/
private static final String engineName ="FACTORIAL";
/**
 * This method returns the engine name.
 * 
 * @return engine name.
 */
public static String getEnginename() {
    return engineName;
}

/**
 * A private field to store the input number.
 */
private int inputNumber;

/**
 * A private field to store the calculated factorial.
 */
private long factorial;

/**
 * This method returns the input number.
 * 
 * @return input number.
 */
public int getInputNumber() {
    return inputNumber;
}

/**
 * This method returns the calculated factorial.
 * 
 * @return calculated factorial.
 */
public long getFactorial() {
    return factorial;
}

/**
 * This method sets the calculated factorial.
 * 
 * @param factorial the calculated factorial.
 */
public void setFactorial(long factorial) {
    this.factorial = factorial;
}

/**
 * This method returns the engine name.
 * 
 * @return engine name.
 */
public String getEngineName() {
    return engineName;
}

/**
 * This method sets the input number after parsing it from a string array.
 * It also checks if the input array length is greater than 2 and exits the program if true.
 * 
 * @param input a string array containing the input values.
 */
public void setInput(String[] input) {
    if (input.length > 2 ) {
        InputChecker.printErrorForTheNumberOfRequiredInputsAndExit(engineName, 1);
    }
    int app = Integer.parseInt(input[1]);
    if (app < 0) {
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName,-1);
    }
    this.inputNumber = Integer.parseInt(input[1]);
    //setInput(new String[] {Integer.toString(inputNumber)});
}

/**
 * This method calculates the factorial of the input number.
 */
public void compute() {
    factorial=1;

    for (int i = 1; i <= inputNumber; i++) {
            factorial *= i;
    }
}


/**
 * This method returns the calculated factorial as a double value.
 * 
 * @return calculated factorial as a double value.
 */
public double getResult() {
    return factorial;
}
}
