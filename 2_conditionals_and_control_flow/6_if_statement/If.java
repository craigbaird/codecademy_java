/*
Let's get familiar with how relational, equality, and Boolean operators can be
used to control the flow of our code.

We'll start by exploring the if statement.

In Java, the keyword if is the first part of a conditional expression.
It is followed by a Boolean expression and then a block of code. If the Boolean
expression evaluates to true, the block of code that follows will be run.
Here's an example of the if statement used with a conditional expression:

if (9 > 2) {
    System.out.println("Control flow rocks!");
}
In the example above, 9 > 2 is the Boolean expression that gets checked. Since
the Boolean expression "9 is greater than 2" is true, Control flow rocks! will
be printed to the console.

The if statement is not followed by a semicolon (;). Instead it uses curly braces
({ and }) to surround the code block that gets run when the Boolean expression is true.
1.
The if statement in the code editor is missing its Boolean expression. Provide
the if statement with a Boolean expression that evaluates to true.
*/

public class If {
	public static void main(String[] args) {

		if (6 <= 9) {

			System.out.println("Access granted.");

		}

	}
}
