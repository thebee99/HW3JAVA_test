/**

A class representing a GCD Engine which implements the Computable interface.
This class takes two integers as input and calculates their Greatest Common Divisor (GCD).

*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;

public class GCDEngine implements Computable {

/**
 * A constant string representing the engine name "GCD".
 */
private static final String engineName ="GCD";

/**
 * A method to get the engine name.
 * @return a string representing the engine name.
 */
public static String getEnginename() {
    return engineName;
}

private int input1;
private int input2;
private int result;

/**
 * A method to get the first input integer.
 * @return an integer representing the first input number.
 */
public int getInput1() {
    return input1;
}

/**
 * A method to set the first input integer.
 * @param input1 an integer representing the first input number.
 */
public void setInput1(int input1) {
    this.input1 = input1;
}

/**
 * A method to get the second input integer.
 * @return an integer representing the second input number.
 */
public int getInput2() {
    return input2;
}

/**
 * A method to set the second input integer.
 * @param input2 an integer representing the second input number.
 */
public void setInput2(int input2) {
    this.input2 = input2;
}

/**
 * A method to set the result of GCD computation.
 * @param result an integer representing the GCD of the two input integers.
 */
public void setResult(int result) {
    this.result = result;
}

/**
 * A method to set the input values for GCD computation.
 * @param args an array of strings representing the input values.
 */
public void setInput(String[] args) {
    if (args.length < 3) {
        InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 2);
    }
    try {
        this.input1 = Integer.parseInt(args[1]);
        this.input2 = Integer.parseInt(args[2]);
    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input format. Please enter integers only.");
        System.exit(0);
    }
    InputChecker.printErrorMessageForNegativeInputsAndExit(engineName, input1);
    InputChecker.printErrorMessageForNegativeInputsAndExit(engineName, input2);
}

/**
 * A method to compute the GCD of the two input integers.
 */
public void compute() {
    this.result = gcd(input1, input2);
}

/**
 * A method to get the computed GCD result.
 * @return an integer representing the GCD of the two input integers.
 */
public double getResult() {
    return result;
}

/**
 * A private helper method to compute the GCD of the two input integers.
 * @param a an integer representing the first input number.
 * @param b an integer representing the second input number.
 * @return an integer representing the GCD of the two input integers.
 */
private int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
}
/**
 * A private helper method to compute the GCD of the two input integers.
 * @param a an integer representing the first input number.
 * @param b an integer representing the second input number.
 * @return an integer representing the GCD of the two input integers.
 */
public int gcd(int[] nums) {
    int result = nums[0];
    for (int i = 1; i < nums.length; i++) {
        result = gcd(result, nums[i]);
    }
    return result;
}
}
