/* FileProcess.java
 * @author: Alberto Melendez
 * @date: 11/11/19
 * Counts each line, word, and character in the the test.txt document.
 */


import java.util.*;
import java.io.*;

public class FileProcess {
   public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("test.txt"));
		
		/*  Initializing these counters outside the main while loop
		 *  is more efficient unlike in the video for this will
		 *  allow them to be existent and updated even after the loops end.
		 */
		
		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;
		
		/* With a main while counting each line and another
		 * while loop inside to count words. The for loop within the 
		 * second while loop is used to count each character in each word
		 * since there isn't an "nextChar()" function that I'm aware of.
		 */
		while (input.hasNextLine()) {
		    lineCount++;
			String line = input.nextLine();
			Scanner ScanLine = new Scanner(line);
			while (ScanLine.hasNext()) {
			    String word = ScanLine.next();
				wordCount++;
				for (int i = 0; i < word.length(); i++) {
				    charCount++;
				}
			}
		}
		/* This print statement is outside the loops so that
		 * it may print the most updated number of each words, lines, 
		 * and characters. 
		*/
		System.out.println("There are " + lineCount + " lines, " + wordCount 
				+ " words, and " + charCount + " characters within the text document.");

	}

}
