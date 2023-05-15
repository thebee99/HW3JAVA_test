package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;
public class CubeVolEngine implements Computable {

    private static final String engineName = "CUBEVOL";

    private double sideLength;

    /**
     * The computed volume of the cube.
     */
    private double volume;

    /**
     * Returns the name of the engine.
     *
     * @return the name of the engine as a String.
     */
    public static String getEngineName() {
        return engineName;
    }

    /**
     * Sets the side length of the cube.
     *
     * @param sideLength the side length of the cube as a double.
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Sets the input for the computation.
     *
     * @param input an array of String representing the input for the computation. The array must contain one element representing the side length of the cube as a double.
     */
    public void setInput(String[] input) {
        try{
            checkMinInput(input);
        }catch (Exception e){
            MinimumInputNumberException.getMessage();
        }
        
        int app = Integer.parseInt(input[1]);
        if (app < 0) {
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName,-1);
        }
        double sideLength = Double.parseDouble(input[1]);
        setSideLength(sideLength);
    }

    static void checkMinInput(String[] input) throws MinimumInputNumberException{
        if(input.length!=2){
            throw new MinimumInputNumberException("You need at least 1 input values for " + engineName.toUpperCase() + ".");
        }

    }

    /**
     * Computes the volume of the cube based on its side length.
     */
    public void compute() {
        volume = sideLength * sideLength * sideLength;
    }

    /**
     * Returns the computed volume of the cube.
     *
     * @return the computed volume of the cube as a double.
     */
    public double getResult() {
        return volume;
    }

    /**
     * Returns the side length of the cube.
     *
     * @return the side length of the cube as a double.
     */
    public double getSideLength() {
        return sideLength;
    }

    /**
     * Returns the computed volume of the cube.
     *
     * @return the computed volume of the cube as a double.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the computed volume of the cube.
     *
     * @param volume the computed volume of the cube as a double.     */
    
    public void setVolume(double volume) {
        this.volume = volume;
    }

}
