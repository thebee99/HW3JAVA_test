/**

A Fibonacci engine that calculates the nth Fibonacci number.
*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;

public class FibonacciEngine implements Computable {
    /**
 * Name of the Fibonacci engine
 */
private static final String engineName ="FIBONACCI";

/**
 * The number that represents the index of the desired Fibonacci number to be calculated.
 */
private int inputNumber;

/**
 * The nth Fibonacci number that has been calculated.
 */
private long fibonacciNumber;

/**
 * Gets the name of the Fibonacci engine.
 * @return A string representing the name of the engine.
 */
public static String getEnginename() {
    return engineName;
}

/**
 * Gets the input number for calculating Fibonacci numbers.
 * @return The input number for calculating Fibonacci numbers.
 */
public int getInputNumber() {
    return inputNumber;
}

/**
 * Gets the calculated Fibonacci number.
 * @return The calculated Fibonacci number.
 */
public long getFibonacciNumber() {
    return fibonacciNumber;
}

/**
 * Sets the value of the input number.
 * @param inputNumber The value to set the input number to.
 */
public void setInputNumber(int inputNumber) {
    this.inputNumber = inputNumber;
}

/**
 * Sets the input to the Fibonacci engine.
 * @param input An array of strings that contains the input values.
 */

public void setInput(String[] input) {
    if (input.length > 2) {
        InputChecker.printErrorForTheNumberOfRequiredInputsAndExit(engineName, 1);
    }
    int app = Integer.parseInt(input[1]);
    if (app < 0) {
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName,-1);
    }    
    int inputNumber = Integer.parseInt(input[1]);
    setInputNumber(inputNumber);
}

/**
 * Calculates the nth Fibonacci number based on the input value.
 */
public void compute() {
    if (inputNumber == 0) {
        fibonacciNumber = 0;
    } else if (inputNumber == 1) {
        fibonacciNumber = 1;
    } else {
        long prevPrevFib = 0;
        long prevFib = 1;
        long currFib = 1;
        for (int i = 2; i <= inputNumber; i++) {
            currFib = prevFib + prevPrevFib;
            prevPrevFib = prevFib;
            prevFib = currFib;
        }
        fibonacciNumber = currFib;
    }
}

/**
 * Gets the result of the calculation, which is the nth Fibonacci number.
 * @return The nth Fibonacci number that was calculated.
 */
public double getResult() {
    return fibonacciNumber;
}
}