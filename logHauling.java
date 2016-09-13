/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program says the number of logs that will fit on a truck.
 *    Log lengths can be 0.25m, 0.5m, 1m.
 *
 ****************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException { 
    
        double logSize;
        int numberOfLogs;
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length of logs in meters.");
        System.out.print("Valid choices are-> 0.25, 0.5, 1: ");
        
        try {
            logSize = Double.parseDouble(br.readLine());
            
            if ((logSize == 0.25 )||(logSize == 0.5)||(logSize == 1.0)) {
                // now calculate how many logs
                numberOfLogs = (int) (1100 / (20 * logSize));
                System.out.println("The truck can carry " + numberOfLogs + 
                                   " logs that are " + logSize + " meter(s) long.");
            } else {
                System.err.println("Not valid input");
            }
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid input!");
        }
        
        System.out.println();
        System.out.println("Done.");
    }

}
