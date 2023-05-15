/**

A class that implements the Computable interface to calculate the square root of a given number.
It takes one input which is a double number, and returns the result which is also a double number.
This class provides methods to set the input, compute the square root, and get the result.
It also has a constant String value to represent the name of this engine, which is "SQRT".
@author [Your Name]
@version 1.0
@since [The date you created the file]
*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;

public class SQRTEngine implements Computable {
    // constant variable to represent the engine name
private static final String engineName = "SQRT";

// private variables for input number and result
private double inputNumber;
private double result;

/**
 * A getter method to get the name of this engine.
 * 
 * @return a String value representing the name of this engine.
 */
public static String getEnginename() {
    return engineName;
}

/**
 * A getter method to get the input number for this engine.
 * 
 * @return a double value representing the input number for this engine.
 */
public double getInputNumber() {
    return inputNumber;
}

/**
 * A setter method to set the result of the computation.
 * 
 * @param result a double value representing the result of the computation.
 */
public void setResult(double result) {
    this.result = result;
}

/**
 * A getter method to get the name of this engine.
 * 
 * @return a String value representing the name of this engine.
 */
public String getEngineName() {
    return engineName;
}

/**
 * A setter method to set the input number for this engine.
 * 
 * @param inputNumber a double value representing the input number for this engine.
 */
public void setInputNumber(double inputNumber) {
    this.inputNumber = inputNumber;
}

/**
 * A method to set the input for this engine.
 * It takes a String array as input and parses the second element as a double number.
 * It also checks if the number is a valid input and exits the program if it's not.
 * 
 * @param input a String array representing the input for this engine.
 */
public void setInput(String[] input) {
    if (input.length > 2) {
        InputChecker.printErrorForTheNumberOfRequiredInputsAndExit(engineName, 1);
    }
    int app = Integer.parseInt(input[1]);
    if (app < 0) {
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName,-1);
    }
    double inputNumber = Double.parseDouble(input[1]);
    setInputNumber(inputNumber);
}

/**
 * A method to compute the square root of the input number and set the result.
 */
public void compute() {
    result = Math.sqrt(inputNumber);
}

/**
 * A getter method to get the result of the computation.
 * 
 * @return a double value representing the result of the computation.
 */
public double getResult() {
    return result;
}

}