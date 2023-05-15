
package edu.handong.csee.java.hw3.engines;
/**
 * The Computable interface represents an object that can compute a result based on a given input.
 */
public interface Computable {

    /**
     * Sets the input for the computation.
     *
     * @param input an array of String representing the input for the computation.
     */
    void setInput(String[] input);

    /**
     * Computes the result based on the input.
     */
    void compute();

    /**
     * Returns the computed result.
     *
     * @return the computed result as a double.
     */
    double getResult();

}
