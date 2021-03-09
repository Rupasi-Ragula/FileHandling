package com.filehandling;
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.io.InputStreamReader;


public class readFromFile {
	public void readData()  {
		try {
			System.out.println("Enter the location of file to read");
			BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			String location=inp.readLine();
			FileReader fr = new FileReader(location);
			BufferedReader br =new BufferedReader(fr);
			int i;    
	        while((i=br.read())!=-1)
	        {  
	          System.out.print((char)i);  
	        } 
	        System.out.println();
	        System.out.println("File Read Successfull");
	        
	        
	        
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println(e+"in read file");
			
		}
		
		
	}

	

}
