# Code Analysis & Best Practices
 
Language: JAVA
Number of Questions: 15
Duration: 2.5 hours

### Programming Assignment


## Part A – Semantics & Refactoring
### <strong>Objective</strong>
In this section you will apply best coding practices to reorganize and refactor code. You will also be renaming classes and variables using good semantics.
### <strong>Activities</strong>

## Old MacDonald
<strong>Here we have a program that is supposed to ‘sing’, well print, the famous nursery rhyme to the screen, one line at a time. The animal on the farm would be entered by the user and the program will complete the song based on the user’s input. Well that’s the intention anyway. The code needs some work…a lot of work. It’s unorganized, and right now it would be a disaster to debug. Take a look… </strong>

_ _ _ _ _ _ _ _ _ _ _ _ _ _ <strong><i>Sample Code</i></strong>_ _ _ _  _ _ _ _ _ _  _ _ _ _ 
```java
import java.io.*;

public class Main {
	
	public static void main(String[] args) {
		InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader y = new BufferedReader(x); 

		A.songIntro();
		
		do {
			try {
				String z = y.readLine().toLowerCase();
				new A(z);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!A.hasAnimal);
		
	}
		
}

class A {
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
	
	A (String animal) {
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
		} while (!A.hasAnimal);
	}
}



class B {
	public static String x () {
		return "bkawhh";
	}
}
```
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ _ _

<strong>What a mess right!!! 
Let’s start off by reorganizing it. It’s good practice to always put your classes in packages. So create a new package and name it <i>“nurseryRhymes”</i>. Within that package, create a new class and name it <i>“Main”</i>. Copy and paste the above program into the Main class. 

Next we are going to do some refactoring. Let’s separate the program by feature and create a class for each. But before that let’s rename some of these classes and variables using the ‘refactor’ tool. First rename class ‘A’ to class ‘Song’. To rename using the refactor tool select/highlight the variable/class/method you want to rename, in this case, select ‘A’. Then click the ‘Refactor’ tab and select ‘Rename’ from the drop down options. 
 
You should see the refactor options under your selection …
 
Now change it to ‘Song’ and press ‘Enter’. This will not only rename the class where it was selected. All references to this class, throughout the program, will be renamed to ‘Song’ as well. We will use this tool to rename the rest of the ambiguous variable and class names throughout the program. In the main method, rename variable ‘x’ to ‘input’, variable ‘y’ to ‘newInput’, and variable ‘z’ to ‘animal’. Rename class ‘B’ to ‘Chicken’, and within that class rename method ‘x’ to ‘cluck’. 

Let’s go ahead and separate some of these features. Within the <i>“nurseryRhymes”</i> package, create another package and name it <i>“nurseryRhymes.oldMacdonald”</i>. Let’s change the view of the package presentation from ‘Flat’ to ‘Hierarchical’. To do this, click on the furthermost right icon (view menu) at the top of the package explorer, select ‘package presentation’ and change it to ‘Hierarchical’. 
 
Now create a new class in the <i>“nurseryRhymes.oldMacdonald”</i> package and name it ‘Song’. Cut and paste everything in the class ‘Song’ from the Main class into this new class ‘Song’. Eclipse might have automatically 

imported the following:
```java 
import nurseryRhymes.Chicken;
import nurseryRhymes.Song;
```
If so, you could go ahead and delete those. To make this class visible to other packages go ahead and make the class public. Also, make the constructor and the Boolean variable <i>‘hasAnimal’</i> public as well. Create another class within the <i>“nurseryRhymes.oldMacdonald”</i> package and name it ‘Chicken’. Cut and paste all the code in the ‘chicken’ class from the Main class into this new class. In order to have access to these classes in the ‘Main’ class we have to import them. In the ‘Main’ class, under the <i>import java.io.*;</i> import all classes from the <i>“nurseryRhymes.oldMacdonald”</i>  package:
```java
import nurseryRhymes.oldMacdonald.*;
```
Great! Let’s use that refactor tool one more time before we move on to debugging. Let’s take a look at the songIntro() method in the ‘Song’ class. You’ll notice a set of try & catch blocks between each ‘system.out.println’. Select/highlight one set of the try and catch blocks. Then click on the refactor tab. This time select ‘Extract method’ from the drop down options. Let’s name this method ‘pause’. Make sure the ‘Replace 9 additional occurrences of statements with method’ box is checked. This should have extracted that block of code into a method called ‘pause’ and replaced the additional try/catch blocks with invocations of that method. There will be a few try/catch blocks left, but don’t worry about those for now, they serve a different purpose. Try giving it a run! 
Yeahhhh,… on to the debugging!!</strong>

## Part B – Debugging & Code Analysis
### <strong>Objective</strong>
<strong>In this section you will debug a program using the debugging tools in Eclipse. You will also be using PMD and Find Bugs to analyze the code statically.</strong>
### <strong>Requirements</strong>
<strong>You will need to install PMD and Find Bugs for static analysis. But don’t worry, I’ll guide you through it when we get there.</strong>
### <strong>Activities</strong>
<strong>If you tried running the Old MacDonald program, you noticed that nothing happened. The program is actually running but nothing is being displayed. Let’s start off by using some break points and take it step by step to see what’s happening under the hood. Placing a break point in your program will tell it to pause or break at that point and await further instructions. Allowing us to see what’s going on at that point in the program. Go to the ‘main’ method in the ‘Main’ class. Since we aren’t sure what’s causing the problem let’s insert a break point on the first line of the method: </strong>
```java
InputStreamReader input = new InputStreamReader(System.in); 
```
<strong>To insert a break point, first locate the line number on the line that would like to place the break point. Then right-click directly to the left of that line number and select ‘Toggle Break Point’. You should see a solid blue circle appear to the left of the line number. Or, place the cursor on the line you would like to insert the break point and press Ctrl+Shift+B. Then click the ‘Run’ tab and select ‘Debug as’ and then ‘Java Application’. Eclipse will ask you if you want to enter the Debug perspective, click Yes. You’ll notice a few more windows appeared in this perspective. You have the Debug window that shows you where you are in the program (Class.method.line#). You also have a variables window that shows you the declared variables and current values as you move through the program. Go ahead and click the ‘Run’ tab and select ‘Step into’ to step through the program line by line. Each time you ‘step into’ you’ll notice the next line is highlighted. Continue to move through the program step by step until something fishy happens. Did you catch it? Once we ‘stepped into’ the <i>intro()</i> method in the ‘Song’ class we can’t seem to step out of it. We’ve got ourselves an ‘accidental’ infinite loop. Let’s go ahead and remove that invocation. Scroll to the top of the ‘Song’ class. Locate the songIntro() method and delete the intro() method call. The first line of that method should now be:</strong>
```java
System.out.println("Old MacDonald had a farm");
```
<strong>
Great! Let’s exit the Debug mode and return to the java perspective to see what we got. Click the ‘Run’ tab and select ‘Terminate’. Click the ‘Window’ tab and select ‘Perspective’, then ‘Open perspective’, and then ‘Java’. Now let’s run the application. Progress!!! Only a few more bugs to go. Enter ‘chicken’ when you’re prompted to enter an animal, since we have a condition set up to handle that input. <i>“Sorry, Mr. Macdonald is out of chickens”</i> should have printed to the screen. Let’s visit the constructor for the ‘Song’ class. We have a condition set up to handle this input but it’s not executing the commands we want it to. Bugs aren’t in short supply today! But let’s try another approach. Finding bugs as we run the program is one way to go about it. Another is to statically analyze the code with a plugin and locate the bugs without having to run it. PMD is an example of this type of plugin. Let’s go ahead and install it and see if it can help us avoid ‘stepping into’ every line of code. </strong>

### <strong>PMD Installation</strong>

<strong>To install the PMD for Eclipse plugin click ‘Help’ and select ‘Install New Software’. Click ‘Add’ and enter the following and click ‘ok’:

<i>Name: PMD for Eclipse Update Site</i>

<i>URL: https://dl.bintray.com/pmd/pmd-eclipse-plugin/updates/</i>

You should see PMD for Eclipse 4. Select the checkbox next to it and click Next. You'll need to accept the license and confirm you want to install a plugin that is not digitally signed. Go ahead and install it anyway. Restart eclipse.

Now let’s use the PMD plugin to analyze our code and see if we get any insight into why our code didn’t execute after meeting the condition. Right-click on the <i>“nurseryRhymes”</i> package and select ‘PMD’, then select ‘Check code’. You’ll notice a few new windows appeared. The one we will be looking at is the Violations Overview view. If this view didn’t show up automatically, no worries just go to Windows, select ‘Show View’, then select ‘Other’. Under PMD, select ‘Violations Overview’ and click Open. You should see both of our packages in this window. 

Since we know where to look lets go directly to the ‘Song’ class and to the constructor. Let’s examine the line where we set the first condition:</strong>
```java
		if(animal == "chicken") 
```
<strong>
If you look to the left of that line number there should be an arrow indicating that PMD has picked something up. If we hover over that arrow, the following message should display:

<i>Use equals() to compare strings instead of “==”.</i>

Go ahead and replace the ‘==’ with equals(). It should look something like this: </strong>
```java
if(animal.equals("chicken")) 
```
<strong>
Alright let’s clear the violations by right-clicking on the package again, select PMD, and select clear violations. Re-enter the Java perspective, and run the program. Let’s see what we’ve got. 

Nice!! The program should have executed without stopping, completing the entire song. Now run the program again and try to enter a different animal. And.….nothing. It should have printed to the screen <i>“Mr. MacDonald doesn’t have any dogs”.</i> You might have already picked this one up already but let me show you one last plugin that will pick this bug up automatically without running the code. This one is called ‘find bugs’.</strong>

### <strong>Find Bugs Installation</strong>

<strong>Click ‘Help’ and select ‘Eclipse Marketplace’. Search for ‘find bugs’. Install the ‘FindBugs Eclipse Plugin’. You'll need to accept the license and confirm you want to install a plugin that is not digitally signed. Go ahead and install it anyway. Restart eclipse. After it restarts, click ‘Window’ and select ‘preferences’. Under Java, click ‘find bugs’ and make sure all of the ‘reported (visible) bug categories’ are checked. Click ‘Apply and close’. 

Right-click on the <i>“nurseryRhymes”</i> package, select Find Bugs, and then select ‘find bugs’ again. Since we know where to look, let’s go directly to that constructor in the ‘Song’ class again. You’ll notice there’s a few indications from the Find Bugs plugin that something <i>buggy</i> is going on. Go directly to the <i>else {…}</i> part of the condition. The second bug is the one that’s breaking our program. If you hover over the second bug, a message should appear mentioning that there is an apparent infinite loop. That’s what’s stopping it from executing the rest of the code. <i>Don’t know how that got in there. Go ahead and remove that while loop. You can remove the Boolean newAnimal declaration as well. </i></strong>
```java
			boolean newAnimal = true;
			while (newAnimal) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
```
<strong>It should end up looking something like this :</strong>
```java
	public Song (String animal) {
		if(animal.equals("chicken")) {
			hasAnimal = true;
			animalSound = Chicken.cluck();
			printSong(animal, animalSound);
		} else {
			System.out.println("Sorry, Mr. Macdonald is out of " + animal + "s \n"
					+ "Try another animal...");
		}
	}
```
<strong>Right-click on the package, select Find Bugs, and then select ‘clear bug markers’. Now run the program again and enter anything other than “chicken” when prompted. Should be smooth sailing.<strong>
### <strong>Report Requirements: </strong>
Please provide comments throughout your code.
### <strong>Hand In</strong>
Submissions will be in the Code Analysis & Best Practices material GitHub repository.   


