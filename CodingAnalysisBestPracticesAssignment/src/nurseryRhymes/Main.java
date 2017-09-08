package nurseryRhymes;

import java.io.*;

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
//renamed a to Song
class Song {
	private String animalSound;
	static boolean hasAnimal = false;
	
	public static final void songIntro () {
		intro();
		System.out.println("Old MacDonald had a farm");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("E - I - E - I - O");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("And on that farm he had a ...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter an animal to see if its on Mr. MacDonald's farm:");
	}
	
	Song (String animal) {
		if(animal == "chicken") {
			hasAnimal = true;
			animalSound = B.x();
			printSong(animal, animalSound);
		} else {
			boolean newAnimal = true;
			while (newAnimal) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
	
	void printSong (String animal, String animalSound) {
		
		System.out.println("Nice!!! He does have " + animal + "s");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("E - I - E - I - O");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("with a " + animalSound + " " + animalSound + " here...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" and a " + animalSound + " " + animalSound + " there...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("  here a " + animalSound + " there a " + animalSound);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("   everywhere a "  + animalSound + " " + animalSound + "!!!!!!");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("    Old MacDonald had a farm");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("     E - I - E - I - OoooOoOooo ");
	}
	
	private static void intro() {
		do{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!Song.hasAnimal);
	}
}



class B {
	public static String x () {
		return "bkawhh";
	}
}