package nurseryRhymes.oldMacdonald;

//renamed a to Song
public class Song {
	private String animalSound;
	public static boolean hasAnimal = false;
	
	public static final void songIntro () {
		//removed intro()
		System.out.println("Old MacDonald had a farm");
		//extracted method for try/catch block and renamed to pause
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("And on that farm he had a ...");
		pause();
		System.out.println("Enter an animal to see if its on Mr. MacDonald's farm:");
	}

	public static void pause() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Song (String animal) {
		//changed if condition for animal == "chicken" as per PMD
		if(animal.equals("chicken")) {
			hasAnimal = true;
			animalSound = Chicken.cluck();
			printSong(animal, animalSound);
		} else {
			//removed infinite while loop checking for newAnimal
			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
	
	void printSong (String animal, String animalSound) {
		
		System.out.println("Nice!!! He does have " + animal + "s");
		pause();
		System.out.println("E - I - E - I - O");
		pause();
		System.out.println("with a " + animalSound + " " + animalSound + " here...");
		pause();
		System.out.println(" and a " + animalSound + " " + animalSound + " there...");
		pause();
		System.out.println("  here a " + animalSound + " there a " + animalSound);
		pause();
		System.out.println("   everywhere a "  + animalSound + " " + animalSound + "!!!!!!");
		pause();
		System.out.println("    Old MacDonald had a farm");
		pause();
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

