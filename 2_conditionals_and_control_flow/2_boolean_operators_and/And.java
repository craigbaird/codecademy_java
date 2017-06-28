/*
Let's look at a set of operators that let us use control flow in our programs.
These operators are called Boolean operators.

There are three Boolean operators that we will explore. Let's start with the
first one: and.

The and operator is represented in Java by &&.
It returns a boolean value of true only when the expressions on both sides of
&& are true.
For example, the code below shows one outcome of the Boolean operator &&:

// The following expression uses the "and" Boolean operator
System.out.println(true && true); // prints true
The code below shows the rest of the possible outcomes of the Boolean operators: &&:

// The following expressions use the "and" Boolean operator
System.out.println(false && false); // prints false
System.out.println(false && true); // prints false
System.out.println(true && false); // prints false
We can also use the Boolean operator && with Boolean expressions such as the following:

System.out.println(2 < 3 && 4 < 5);
The example above will print out true because the statements "2 is less than 3"
and "4 is less than 5" are both true.
Instructions
1.
Use the && operator and any two Boolean expressions of your choice between the
parentheses of System.out.println(); in order to print out a value of true or false to the console.
*/

public class And {
	public static void main(String[] args) {

		System.out.println(5 < 6 && 6 == '6');

	}
}
