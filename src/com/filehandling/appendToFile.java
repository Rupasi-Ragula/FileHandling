package com.filehandling;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.*;
import java.util.Scanner;
public class appendToFile {
	public void appendData(){
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
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename,true));
			writer.append("\n");
			writer.append(data);
			System.out.println("Appending into the file successful");
			writer.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
