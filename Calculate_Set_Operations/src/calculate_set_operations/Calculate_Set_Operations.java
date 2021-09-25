/*
Course: CS 240 - Discrete Structures
Project: Set Operations: Power Set, Cartesian Product, Union, Intersection,
                         Difference, and Complement
Name: Grant Seime
Date: 9/17/2020
Description: Collect input from user for two sets. Calculations for 6 set 
             operations are performed and ready to print. The user selects the 
             set operation to be performed, enters how many integers are in the 
             set, and enters each integer one by one. Results print to screen.  
 */
package calculate_set_operations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner; 

enum SetOperations { POWERSET, CARTESIAN, UNION, INTERSECTION, DIFFERENCE, 
                     COMPLEMENT, ALL, UNKNOWN };

public class Calculate_Set_Operations {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in); 
        ArrayList<Integer> listS = new ArrayList(); 
        ArrayList<Integer> listT = new ArrayList();
        Integer[] setS;
        Integer[] setT;
        String setOperation;
        int numOfInts; 
        
        System.out.println("Available set operations - "
                + "Powerset - Cartesian - Union - Intersection - Difference - "
                + "Complement - All");
        
        System.out.print("Choice of Set Operation(case insensitive): \n");
        
        setOperation = userInput.nextLine();  
        // Switch to choose set operation
        switch (getSetOperation(setOperation)) {
            
            case POWERSET:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                //Integer[] setS = new Integer[numOfInts];
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                System.out.println("");
                power_set(setS);
            break;    
             
            case CARTESIAN:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for 
                System.out.println("");
                cartesian_product(setS, setT);
            break;
            
            case UNION:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for
                System.out.println("");
                union(setS, setT); 
            break;
            
            case INTERSECTION:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for 
                System.out.println("");
                intersection(setS, setT);
            break;
            
            case DIFFERENCE:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for 
                System.out.println("");
                difference(setS, setT);
            break;
            
            case COMPLEMENT:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for 
                complement(setS, setT);
            break;
            
            case ALL:
                // Set S
                System.out.println("How many integers in Set S? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                System.out.println("Enter integers into Set S one at a time: ");
                setS = new Integer[numOfInts];
                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listS.add(addToList);
                    setS[i] = listS.get(i);
                } // end for 
                
                // Set T
                System.out.println("How many integers in Set T? ");
                numOfInts = Integer.parseInt(userInput.nextLine());
                setT = new Integer[numOfInts];
                System.out.println("Enter integers into Set T one at a time: ");

                for (int i = 0; i < numOfInts; i++) {
                    int addToList = Integer.parseInt(userInput.nextLine());
                    listT.add(addToList);
                    setT[i] = listT.get(i);
                } // end for 
                // Power Set of S; print
                power_set(setS); 
                // Cartesian Product of S&T; print
                cartesian_product(setS, setT);
                // Union of S & T; print
                union(setS, setT); 
                // Intersection of S & T; print
                intersection(setS, setT);
                // Difference of S & T; print
                difference(setS, setT);
                // Complement of S & T; print
                complement(setS, setT); 
            break;
            
            case UNKNOWN:
                System.out.println("Unknown input. Please try again. Choose a set operation"
                     + " from the list and ensure the spelling is the same as listed."); 
            break;     
        }       
    } // end method main
    
    // Power Set method. 
    public static void power_set (Integer[] setS) {
        // size of Set = 2^n (n being length of set)
        int power_set_size = (int) Math.pow(2, setS.length); 
        
        System.out.println("Power Set: ");
        System.out.print("{");
        for (int i = 0; i < power_set_size; i++) { 
            System.out.print(" {");
            // shift left 1 bit position( 1<< j)/           
            // check jth bit in counter(in this case: i). If set then print jth 
            // element from the set
            for (int j = 0; j < setS.length; j++) {
                if((i & (1 << j)) > 0) 
                    System.out.print(setS[j]);        
            } // end for j
            System.out.print("}");
        } // end for i
        System.out.print(" }");
        System.out.println(""); 
    } // end method power set 
    
    // Cartesian Product method. 
    public static void cartesian_product (Integer[] setS, Integer[] setT) {
        
        ArrayList<Integer> setX = new ArrayList<>(Arrays.asList(setS));
        ArrayList<Integer> setY = new ArrayList<>(Arrays.asList(setT));
            
        System.out.println("Cartesian Product: ");
        System.out.print("{ ");
        // Iterate through the 2 ArrayList and pair setX and setY 
        for (int i = 0; i < setX.size(); i++) { 
            for (int j = 0; j < setY.size(); j++) {
                System.out.print("{" + setX.get(i) + ", " + setY.get(j) + "} ");
            } // end for j
        } // end for i
        System.out.print(" }"); 
        System.out.println("");
    } // end method cartesian product
    
    // Union method. Using HashSet is a simple solution for union
    // because HashSet doesn't allow for duplicate entries. 
    public static void union(Integer[] setS, Integer[] setT) {
       // HashSet for combining arrays 
       HashSet<Integer> set = new HashSet<>();
       set.addAll(Arrays.asList(setS)); 
       set.addAll(Arrays.asList(setT));
       // Convert to new array; Print 
       Integer[] union = {};
       union = set.toArray(union);
       System.out.println("Union: ");
       System.out.println(Arrays.toString(union).replace("[", "{")
               .replace("]", "}"));
    } // end method Union
    
    // Intersection method. 
    public static void intersection(Integer[] setS, Integer[] setT) {
       // ArrayList's to hold setS and setT
       ArrayList<Integer> setX = new ArrayList<>(Arrays.asList(setS));
       ArrayList<Integer> setY = new ArrayList<>(Arrays.asList(setT));
       HashSet<Integer> set = new HashSet<>();
       // iterate thru list setX checking for setY values; add matches to HashSet
       for(int i = 0; i < setX.size(); i++) {
           for(int j = 0; j < setY.size(); j++) {
               if(setX.get(i) == setY.get(j))
                   set.add(setY.get(j));
           } // end for j   
       } // end for i
       
       // Convert to new array; Print
       Integer[] intersection = {};
       intersection = set.toArray(intersection);
       System.out.println("Intersection: ");
       System.out.println(Arrays.toString(intersection).replace("[", "{")
               .replace("]", "}"));
    } // end method intersection
    
    // Difference method. Using 2 ArrayList and removeAll 
    public static void difference(Integer[] setS, Integer[] setT) {
       // Pass the Integer[] arrays to their respective ArrayList 
       ArrayList<Integer> setX = new ArrayList<>(Arrays.asList(setS));
       ArrayList<Integer> setY = new ArrayList<>(Arrays.asList(setT));
       // Remove matching numbers from setX that are also in setY 
       setX.removeAll(setY);
       // Convert to new array; Print
       Integer[] difference = {};
       difference = setX.toArray(difference);
       System.out.println("Difference: ");
       System.out.println(Arrays.toString(difference).replace("[", "{")
               .replace("]", "}"));
    } // end method Difference 
    
    // Complement method. Using 2 ArrayList and a HashSet. Add both ArrayList 
    // like the Union operation to the HashSet set and then use removeAll to subtract 
    public static void complement(Integer[] setS, Integer[] setT) {
        // Pass the Integer[] arrays to their respective ArrayList 
       ArrayList<Integer> setX = new ArrayList<>(Arrays.asList(setS));
       ArrayList<Integer> setY = new ArrayList<>(Arrays.asList(setT));
       HashSet<Integer> set = new HashSet<>();
       // Combine setX and setY to set. Remove setX elements.   
       set.addAll(setX);
       set.addAll(setY);
       set.removeAll(setX); 
       // Convert to new array; Print
       Integer[] complement = {};
       complement = set.toArray(complement);
       System.out.println("Complement: ");
       System.out.println(Arrays.toString(complement).replace("[", "{")
               .replace("]", "}"));   
    } //end method complement
      
    static SetOperations getSetOperation ( String input )                                                                          // getDessertType for the enum and switch statement
    {
        if ( input.equalsIgnoreCase( "Powerset" ))
        {
            return SetOperations.POWERSET; 
        } else if ( input.equalsIgnoreCase( "Cartesian" ))
        {
            return SetOperations.CARTESIAN; 
        }
        else if ( input.equalsIgnoreCase( "Union" ))
        {
            return SetOperations.UNION; 
        }
        else if ( input.equalsIgnoreCase( "Intersection" ))
        {
            return SetOperations.INTERSECTION; 
        } else if ( input.equalsIgnoreCase( "Difference" ))
        {
            return SetOperations.DIFFERENCE; 
        } else if ( input.equalsIgnoreCase( "Complement" ))
        {
            return SetOperations.COMPLEMENT; 
        } else if ( input.equalsIgnoreCase( "All" ))
        {
            return SetOperations.ALL; 
        }
        return SetOperations.UNKNOWN; 
    
    } // end getSetOperation method 
} // end class calc set operations
