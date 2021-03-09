package com.filehandling;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Mai {
	public void menu() {
		System.out.println("____________________");
		System.out.println("Select a choice from below menu");
		System.out.println("0-> Exit");
		System.out.println("1-> Reading a file");
		System.out.println("2-> Writing a file");
		System.out.println("3-> Appending to a file");
		System.out.println("____________________");
	}
	public int getchoice() throws IOException {
		int choice=0;
		try {
			BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
			choice = Integer.parseInt(inp.readLine());
			System.out.println("___________");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		return choice;
	}
	
	public static void main(String args[]) {
		Mai obj = new Mai();
		int choice=1;
		try {
		while(choice!=0) {
			obj.menu();
			choice=obj.getchoice();
			if(choice==0) {
				System.out.println("*****Thank You*****");
				break;
			}
			if(choice==1)
			{
				readFromFile robj = new readFromFile();
				robj.readData();
			}
			else if(choice==2)
			{
				writeToFile wobj = new writeToFile();
				wobj.writeData();
			}
			else if(choice==3)
			{
				appendToFile aobj = new appendToFile();
				aobj.appendData();
			}
			else 
			{
				System.out.println("Incorrect choice.");
			}
			
		}
		}
		catch(IOException e) {
			System.out.println("e");
		}
	}
		

}
