/*
So far, we've explored primitive data types and Java syntax. As we've seen, Java programs follow the instructions we provide them, such as printing values to the console.

We can also write Java programs that can follow different sets of instructions depending on the values that we provide to them. This is called control flow. In this lesson, we'll learn how to use control flow in our programs.
Instructions
1.
Take a look at the code in the editor. If it looks confusing to you right now, don't worry! After this lesson, you'll be able to read and write Java programs that use control flow.

Click Run to run the code.
*/

public class Conditionals {
	public static void main(String[] args) {


		if (1 < 4 && 0 > 5) {

			System.out.println("You ordered a cup of hot, mint tea.");

		} else if (21 <= 19 || 17 >= 28) {

			System.out.println("You ordered freshly squeezed orange juice!");

		} else if ( !(true == true) ) {

			System.out.println("You ordered hot cocoa!");

		} else {

			System.out.println("You ordered a cup of Java!");

		}

		char answerChoice = 'C';

		switch (answerChoice) {

			case 'A': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'B': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			case 'C': System.out.println("You answered: " + answerChoice + ". That is correct!");
								break;

			case 'D': System.out.println("You answered: " + answerChoice + ". Please try again.");
								break;

			default:
				System.out.println("Please select a valid answer choice.");

		}


	}
}
