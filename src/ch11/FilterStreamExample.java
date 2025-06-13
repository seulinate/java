package ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilterStreamExample {

	public static void main(String[] args) {
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;
		
		try {
			String inFile = "in.txt";
			String outFile = "out2.txt";
			
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine(); //readLine() 특징 -> 한줄씩 읽어서 line에 넣고 
			
			while(line != null) {
				bufOutput.write(line,0,line.length());
				bufOutput.newLine();
				line = bufInput.readLine(); 
			}
			System.out.println(inFile+">>"+outFile);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bufInput != null)
				try {bufInput .close();} catch(IOException e) {}
			if(bufOutput != null)
				try {bufOutput.close();} catch(IOException e) {}
		}
		
	}

}
