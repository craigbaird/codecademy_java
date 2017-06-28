/*
Good work! In some cases, we need to execute a separate block of code depending
on different Boolean expressions. For that case, we can use the if/else if/else
statement in Java.

If the Boolean expression after the if statement evaluates to true, it will run
the code block that directly follows.
Otherwise, if the Boolean expression after the else if statement evaluates to
true, the code block that directly follow will run.
Finally, if all previous Boolean expressions evaluate to false, the code within
the else block will run.
Here's an example of control flow with the if/else if/else statement:

int shoeSize = 10;

if (shoeSize > 12) {
    System.out.println("Sorry, your shoe size is currently not in stock.");
} else if (shoeSize >= 6) {
    System.out.println("Your shoe size is in stock!");
} else {
    System.out.println("Sorry, this store does not carry shoes smaller than a
    size 6.");
}
In the example above, the int variable shoeSize is equal to 10, which is not
greater than 12, but it is greater than or equal to 6. Therefore, the code block after the else if statement will be run.
Instructions
1.
Set the value of the round variable so that the code in the else if block runs.
*/

public class IfElseIf {
	public static void main(String[] args) {

		int round = 6;

		if (round > 12) {

			System.out.println("The match is over!");

		} else if (round > 0) {

			System.out.println("The match is underway!");

		}	else {

			System.out.println("The boxing match hasn't started yet.");

		}
	}
}
