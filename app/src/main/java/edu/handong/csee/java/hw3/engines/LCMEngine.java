package edu.handong.csee.java.hw3.engines;

import edu.handong.csee.java.hw3.exceptions.*;

/**
 * A class for computing the Least Common Multiple (LCM) of multiple integers
 */
public class LCMEngine implements Computable {

    private static final String engineName = "LCM";
    private int[] inputs;
    private int result;

    /**
     * Returns the engine name
     * 
     * @return engine name
     */
    public String getEngineName() {
        return engineName;
    }

    /**
     * Returns the inputs
     * 
     * @return inputs
     */
    public int[] getInputs() {
        return inputs;
    }

    /**
     * Sets the inputs
     * 
     * @param inputs inputs
     */
    public void setInputs(int[] inputs) {
        this.inputs = inputs;
    }

    /**
     * Sets the computed result
     * 
     * @param result computed result
     */
    public void setResult(int result) {
        this.result = result;
    }

    /**
     * Sets the inputs using the given command line arguments
     * 
     * @param args command line arguments
     */
    public void setInput(String[] args) {
        if (args.length < 3) {
            InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 2);
        }

        inputs = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            inputs[i - 1] = Integer.parseInt(args[i]);
            InputChecker.printErrorMessageForNegativeInputsAndExit(engineName, inputs[i - 1]);
        }
    }

    /**
     * Computes the LCM of the input values
     */
    public void compute() {
        result = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            result = lcm(result, inputs[i]);
        }
    }

    /**
     * Returns the computed result
     * 
     * @return computed result
     */
    public double getResult() {
        return (double) result;
    }

    // private utility methods for computing LCM and GCD

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
