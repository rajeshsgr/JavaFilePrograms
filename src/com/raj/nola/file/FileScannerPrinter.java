package com.raj.nola.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerPrinter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//creating File instance to reference text file in Java
        File text = new File("test.txt");
        
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
        
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        
        while(scnr.hasNextLine()){
            String lineContent = scnr.nextLine();
            System.out.println(lineNumber + " " + lineContent);
            lineNumber++;
        }    

	}

}
