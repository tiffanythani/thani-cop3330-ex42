/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tiffany Thani
 */

package ex42;
import java.util.*;
import java.io.*;

public class Exercise42{

    //Using method of inputting files from Ex41

    public void printDetails(String filename)
 {
        try {
            File input = new File(filename);
            Scanner scanner = new Scanner(input);

            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR! the file is not found.");
        }
    }

    // This is the driver method to test the code
    public static void main(String[] args) {

        Exercise42 emp = new Exercise42();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("-----------------------------------------");
        emp.printDetails("exercise42_input.txt");
    }
}
