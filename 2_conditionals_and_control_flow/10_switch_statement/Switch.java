/*
The conditional statements that we have covered so far require Boolean expressions
to determine which code block to run. Java also provides a way to execute code
blocks based on whether a block is equal to a specific value. For those specific
cases, we can use the switch statement, which helps keep code organized and less wordy.

The switch statement is used as follows:

int restaurantRating = 3;

switch (restaurantRating) {

    case 1: System.out.println("This restaurant is not my favorite.");
      break;

    case 2: System.out.println("This restaurant is good.");
      break;

    case 3: System.out.println("This restaurant is fantastic!");
      break;

    default: System.out.println("I've never dined at this restaurant.");
      break;
}
In the example above, we assigned the int variable restaurantRating a value of 3.
The code will print a message to console based on the value of restaurantRating.

In this case, This restaurant is fantastic! is printed to the console.

The break statement will exit the switch statement after a condition is met. Without
the break statement, Java will continue to check whether the value of restaurantRating
matches any other cases.

The default case is printed only if restaurantRating is not equal to an int with the
value of 1, 2, or 3.
Instructions
1.
Set the code block under the default case to:

System.out.println("Messi is in position...");
2.
Look at the code in the code editor. Set the char variable penaltyKick value to L, R, or C.
*/

public class Switch {
	public static void main(String[] args) {

		char penaltyKick = 'L';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break;
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}
