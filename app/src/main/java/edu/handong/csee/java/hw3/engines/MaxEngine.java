/**

This class represents an engine that calculates the maximum value among a set of integers.
The engine implements the Computable interface and has methods for setting input values,
computing the maximum value, and getting the result. The engine also has a static method for
getting the name of the engine.
*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;

public class MaxEngine implements Computable {
    // static constant engine name
private static final String engineName = "MAX";

// instance variable for storing input values
private int[] inputs;

// instance variable for storing the computed result
private int result;

/**
 * Returns the name of the engine.
 *
 * @return the name of the engine
 */
public static String getEnginename() {
    return engineName;
}

/**
 * Sets the input values for the engine.
 *
 * @param args an array of string arguments containing the input values
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
 * Computes the maximum value from the input values.
 */
public void compute() {
    this.result = Integer.MIN_VALUE;
    for (int i = 1; i < inputs.length; i++) {
        if (inputs[i] > result) {
            result = inputs[i];
        }
    }
}

/**
 * Returns the computed result.
 *
 * @return the maximum value from the input values
 */
public double getResult() {
    return result;
}

/**
 * Returns the input values.
 *
 * @return an array of integers containing the input values
 */
public int[] getInputs() {
    return inputs;
}

/**
 * Sets the input values for the engine.
 *
 * @param inputs an array of integers containing the input values
 */
public void setInputs(int[] inputs) {
    this.inputs = inputs;
}
}