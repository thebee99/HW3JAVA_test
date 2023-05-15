/**

A class representing a computational engine for calculating the volume of a sphere.
It implements the Computable interface.
The input required for this engine is the radius of the sphere as a double.
*/
package edu.handong.csee.java.hw3.engines;
import edu.handong.csee.java.hw3.exceptions.*;
public class SphereVolEngine implements Computable {
/**
* A constant string representing the name of this engine.
*/
private static final String engineName = "SPHEREVOL";
/**
 * A double value representing the radius of the sphere.
 */
private double radius;

/**
 * A double value representing the volume of the sphere.
 */
private double volume;

/**
 * Returns the name of this engine.
 * @return A string representing the name of this engine.
 */
public static String getEngineName() {
    return engineName;
}

/**
 * Returns the radius of the sphere.
 * @return A double value representing the radius of the sphere.
 */
public double getRadius() {
    return radius;
}

/**
 * Sets the radius of the sphere.
 * @param radius A double value representing the radius of the sphere.
 */
public void setRadius(double radius) {
    this.radius = radius;
}

/**
 * Returns the volume of the sphere.
 * @return A double value representing the volume of the sphere.
 */
public double getVolume() {
    return volume;
}

/**
 * Sets the volume of the sphere.
 * @param volume A double value representing the volume of the sphere.
 */
public void setVolume(double volume) {
    this.volume = volume;
}

/**
 * Sets the input required for this engine, which is the radius of the sphere as a double value.
 * @param input A string array representing the input for this engine.
 */
public void setInput(String[] input) {
    if (input.length!=2){
        InputChecker.printErrorForTheNumberOfRequiredInputsAndExit(engineName, 1);
        }
    int app = Integer.parseInt(input[1]);
    if (app < 0) {
        InputChecker.printErrorMessageForNegativeInputsAndExit(engineName,-1);
    }
    double radius = Double.parseDouble(input[1]);
    setRadius(radius);
}

/**
 * Computes the volume of the sphere using the given radius.
 */
public void compute() {
    volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
}

/**
 * Returns the result of the computation, which is the volume of the sphere.
 * @return A double value representing the volume of the sphere.
 */
public double getResult() {
    return volume;
}

}