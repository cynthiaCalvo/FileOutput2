/*
 * Cynthia C.
 * 7th April, 2020
 */
package fileOutput2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StoryMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line;
		
		try {
			FileReader reader = new FileReader("outputStory.txt");
			BufferedReader br = new BufferedReader(reader);
			
			line = br.readLine();
			//will print out lines
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
			
			FileWriter writer = new FileWriter("outputStory.txt", true);
			BufferedWriter bw = new BufferedWriter(writer);
			
			System.out.println("Would you like to add another line? (Yes/No)");
			//will either prompt the user to enter another line or end the program
			if(input.nextLine().equalsIgnoreCase("yes")) {
				System.out.println("Add a line to a story: ");
				line = input.nextLine();
				bw.newLine();
				bw.write(line);
			}else {
				System.out.println("fine, be that way");
			}
			bw.close();
		}catch(IOException e) {
			System.out.println("This Doesn't Work");
		}

	}

}
