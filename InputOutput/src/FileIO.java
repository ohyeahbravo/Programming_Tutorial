import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
	
	public static void main(String[] args) {
		try {
			
			File first = new File("first.txt");
			FileWriter writer = new FileWriter(first);
			BufferedWriter b_writer = new BufferedWriter(writer);
			b_writer.write("one ends with 1\r\n");
			b_writer.write("two ends with 2\r\n");
			b_writer.write("three ends with 3\r\n");
			b_writer.write("four ends with 4\r\n");
			b_writer.write("five ends with 5\r\n");
			b_writer.close();
			writer.close();
			
			File second = new File("second.txt");
			FileWriter writer2 = new FileWriter(second);
			BufferedWriter b_writer2 = new BufferedWriter(writer2);
			
			FileReader reader = new FileReader(first);
			BufferedReader b_reader = new BufferedReader(reader);
			
			char current;
			String word;
			boolean firstword;
			int s_length;
			
			String sentence = b_reader.readLine();
			
			while(sentence != null) {
				
				word = "";
				firstword = true;
				s_length = sentence.length();
				
				for(int i = 0; i < s_length; i++) {
					// get each character
					current = sentence.charAt(i);
					// add to word string
					word += current;
					
					// when the word completes
					if(current == ' ' || i == s_length - 1) {
						// when it's the first word
						if(firstword) {
							word = word.replaceAll("\\s", "");
							b_writer2.write(word + "\r\n");
							firstword = false;
						}
						// when it's the last word
						if(i == s_length - 1) {
							b_writer2.write(word + "\r\n");
						}
						
						// initialize the word
						word = "";
					}
				}
					sentence = b_reader.readLine();
			}
			b_reader.close();
			reader.close();
			b_writer2.close();
			writer2.close();	
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	//todo: Create a file with at least 5 lines of arbitrary text
	//create a second file and copy the first and the last word of every line of your arbitrary text
	//donot forget to save your file
	
}
