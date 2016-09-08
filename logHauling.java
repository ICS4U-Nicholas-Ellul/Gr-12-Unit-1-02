/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This program says the number of logs that will fit on a truck.
 *    Log lengths can be 0.25m, 0.5m, 1m.
 *
 ****************************************************************************/
 
 import java.util.Scanner;


class Main {
    public static void main(String[] args) {
    
        //Initialize Scanner that will control user input
        Scanner wordScanner = new Scanner(System.in);
  		
        System.out.println("Please enter log length in (m). 0.25, 0.5, or 1.");
        double logLength = wordScanner.nextDouble();
        System.out.println(logLength);
        
        if(logLength == 0.25){
        	System.out.println("You can carry 220 logs.");
        }
        
        else if(logLength == 0.5){
        	System.out.println("You can carry 110 logs.");
        }
        
        else if(logLength == 1){
        	System.out.println("You can carry 55 logs.");
        }
        else{
        	System.out.println("Please enter your choice again.");
        }
  }
}
