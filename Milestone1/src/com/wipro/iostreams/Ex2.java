package com.wipro.iostreams;
import java.io.*;
import java.util.*;
public class Ex2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFilename = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFilename = sc.nextLine();
	
		File fin = new File(inputFilename);
		File fout = new File(outputFilename);
		
		BufferedReader br = new BufferedReader(new FileReader(fin));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		System.out.println("File copied successfully ");
		
		br.close();
		bw.close();
		sc.close();
	}

}
