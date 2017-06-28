/*
if/else statements can become lengthy even when you simply want to return a value
depending on a Boolean expression. Fortunately, Java provides a shortcut that allows
you to write if/else statements in a single line of code. It is called the ternary
conditional statement.

The term ternary comes from a Latin word that means "composed of three parts".

These three parts are:

A Boolean expression
A single statement that gets executed if the Boolean expression is true
A single statement that gets executed if the Boolean expression is false
Here is an example of a ternary conditional statement:

int pointsScored = 21;

char gameResult = (pointsScored > 20) ? 'W' : 'L';
System.out.println(gameResult);
In the example above, the int variable called pointsScored is equal to 21.

The Boolean expression is (pointsScored > 20), which evaluates to true. This will
return the value of 'W', which is assigned to the variable gameResult. The value 'W'
is printed to the console.
1.
Set the canDrive variable equal to the ternary expression: (fuelLevel > 0) ? 'Y' : 'N';
*/

public class Ternary {
	public static void main(String[] args) {

		int fuelLevel = 3;

		char canDrive = (fuelLevel > 0) ?
      'Y' : 'N';
		System.out.println(canDrive);

	}
}
