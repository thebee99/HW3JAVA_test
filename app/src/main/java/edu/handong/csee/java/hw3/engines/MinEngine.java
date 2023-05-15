/**

This class implements the Computable interface to compute the minimum value from given integer inputs.
It contains methods to set the inputs, compute the minimum value, and get the result.
The minimum value is computed using the Integer.MIN_VALUE as the initial value of the result and iterating over the inputs array to find the minimum value.
The class also provides a static method to get the engine name as a string.
@see Computable
*/
package edu.handong.csee.java.hw3.engines;

import edu.handong.csee.java.hw3.exceptions.*;

public class MinEngine implements Computable {
/**
 * The static field engineName holds the name of the engine, which is "MIN".
 */
private static final String engineName ="MIN";

/**
 * The inputs field holds an array of integers.
 */
private int[] inputs;

/**
 * The result field holds the minimum value computed from the inputs.
 */
private int result;

/**
 * This method sets the inputs field by parsing the string array of input arguments.
 * If the input argument length is less than 2, an error message will be printed to the console and the program will exit.
 * If the input argument contains non-integer values, an error message will be printed to the console and the program will exit.
 * If the input argument contains negative integer values, an error message will be printed to the console and the program will exit.
 * @param args a string array of input arguments.
 */
public void setInput(String[] args) {
    if (args.length < 3) {
        InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 2);
    }
    this.inputs = new int[args.length];
    for (int i = 1; i < args.length; i++) {
        try {
            this.inputs[i] = Integer.parseInt(args[i]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format. Please enter integers only.");
            System.exit(0);
        }
        //InputChecker.printErrorMessageForNegativeInputsAndExit(engineName, inputs[i]);
    }
}

/**
 * This method computes the minimum value from the inputs by using Integer.MAX_VALUE as the initial value of the result
 * and iterating over the inputs array to find the minimum value.
 */
public void compute() {
    this.result = Integer.MAX_VALUE;
    for (int i = 1; i < inputs.length; i++) {
        if (inputs[i] < result) {
            result = inputs[i];
        }
    }
}

/**
 * This method returns the computed minimum value as a double.
 * @return the computed minimum value as a double.
 */
public double getResult() {
    return result;
}

/**
 * This method returns the engine name as a string.
 * @return the engine name as a string.
 */
public static String getEnginename() {
    return engineName;
}

}