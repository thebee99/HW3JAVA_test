package edu.handong.csee.java.hw3;


import edu.handong.csee.java.hw3.engines.Computable;
import edu.handong.csee.java.hw3.engines.CubeVolEngine;
import edu.handong.csee.java.hw3.engines.FactorialEngine;
import edu.handong.csee.java.hw3.engines.FibonacciEngine;
import edu.handong.csee.java.hw3.engines.GCDEngine;
import edu.handong.csee.java.hw3.engines.LCMEngine;
import edu.handong.csee.java.hw3.engines.MaxEngine;
import edu.handong.csee.java.hw3.engines.MinEngine;
import edu.handong.csee.java.hw3.engines.SQRTEngine;
import edu.handong.csee.java.hw3.engines.SphereVolEngine;

public class Calculator {

/**
 * This is the main method which runs the calculator program.
 * It creates a Calculator object and calls the run method.
 * 
 * @param args the command line arguments, with the first argument being the engine option, and the rest being the input values.
 */

    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        myCalculator.run(args);
    }

/**
 * This method executes the computation based on the input provided.
 * It first checks if there is any input provided, and prints an error message if there isn't.
 * It then identifies the engine option provided, creates the corresponding engine object, and calls the compute method.
 * Finally, it prints the result of the computation.
 * 
 * @param args the command line arguments, with the first argument being the engine option, and the rest being the input values.
 */

    public void run(String[] args) {

        if (args.length == 0) {
            System.out.println("Please put a computing engine option such as LCM, GCD, SQRT, FACTORIAL, FIBONACCI, MAX, MIN, CUBEVOL, and SPHEREVOL.\nFor example, java -cp [your classpath] edu.handong.csee.java.hw2.Calculator MAX 12 4 5 45 100");
            System.exit(0);
        }

        String engineName = args[0].toUpperCase();

        Computable engine =null;

        switch(engineName) {
            case "LCM":
                engine = new LCMEngine();
                break;
            case "GCD":
                engine = new GCDEngine();
                break;
            case "SQRT":
                engine = new SQRTEngine();
                break;
            case "FACTORIAL":
                engine = new FactorialEngine();
                break;
            case "FIBONACCI":
                engine = new FibonacciEngine();
                break;
            case "MAX":
                engine = new MaxEngine();
                break;
            case "MIN":
                engine = new MinEngine();
                break;
            case "CUBEVOL":
                engine = new CubeVolEngine();
                break;
            case "SPHEREVOL":
                engine = new SphereVolEngine();
                break;
            default:
                System.out.println("Invalid command: " + engineName);
                System.exit(0);
        }

        engine.setInput(args);
        engine.compute();

        System.out.println("The result of " +  engineName + " is " + engine.getResult() + ".");

    }


}