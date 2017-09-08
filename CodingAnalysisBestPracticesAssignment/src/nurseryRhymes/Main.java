package nurseryRhymes;

import java.io.*;
import nurseryRhymes.oldMacdonald.*;

public class Main {
	
	public static void main(String[] args) {
		//rename x to input
		InputStreamReader input = new InputStreamReader(System.in);
		//rename y to newInput
		BufferedReader newInput = new BufferedReader(input); 
		
		//renamed a to Song
		Song.songIntro();
		
		do {
			try {
				//renamed z to animal
				String animal = newInput.readLine().toLowerCase();
				new Song(animal);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
		
	}
		
}
