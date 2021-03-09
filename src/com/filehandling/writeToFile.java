package com.filehandling;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;

public class writeToFile {
	public void writeData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename = sc.nextLine();
		File f = new File(filename);
		if(f.exists()) {
			System.out.println("\t->File exits");
		}
		else {
			System.out.println("\t->File does not exits\n\t->New File Created");
		}
		System.out.println("Enter data to write into file:");
		String data = sc.nextLine();
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(data);
			System.out.println("Writing into file successful");
			writer.close();
		}
		
		catch(IOException e) {
			System.out.println(e+"in write file");
		}
		
		
		
		
	}

	
}
