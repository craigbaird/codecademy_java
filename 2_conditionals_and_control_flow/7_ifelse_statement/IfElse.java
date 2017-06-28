/*
Sometimes we execute one block of code when the Boolean expression after the if
keyword is true. Other times we may want to execute a different block of code
when the Boolean expression is false.

We could write a second if statement with a Boolean expression that is opposite
the first, but Java provides a shortcut called the if/else conditional.

The if/else conditional will run the block of code associated with the if statement
if its Boolean expression evaluates to true.
Otherwise, if the Boolean expression evaluates to false, it will run the block of
code after the else keyword.
Here's an example of if/else syntax:

if (1 < 3 && 5 < 4) {
    System.out.println("I defy the Boolean laws!")
} else {
    System.out.println("You can thank George Boole!");
}
In the example above, the Boolean expression "1 is less than 3" and "5 is less
than 4" evaluates to false. The code within the if block will be skipped and the
code inside the else block will run instead. The text "You can thank George Boole!"
will be printed in the console.
Instructions
1.
The if/else statement in the code editor currently prints out the code in the if
block. Modify the if statement's Boolean expression so that the code in the else
block gets executed and prints to the console.
*/

public class IfElse {
	public static void main(String[] args) {

		if (7 <= 6) {

			System.out.println("Try again...");

		} else {

			System.out.println("Success!");

		}

	}
}
