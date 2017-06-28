/*
Great! The second Boolean operator that we will explore is called or.

The or operator is represented in Java by ||.
It returns a Boolean value of true when at least one expression on either side
of || is true.
The code below shows all the outcomes of the Boolean operator ||:

//The "or" Boolean operator:

System.out.println(false || false); // prints false
System.out.println(false || true); // prints true
System.out.println(true || false); // prints true
System.out.println(true || true); // prints true
We can also use the Boolean operator || with Boolean expressions such as the
following:

System.out.println(2 > 1 || 3 > 4);
The example above will print out true because at least one statement — "2 is
greater than 1" — is true even though the other statement — "3 is greater than
4" — is false.
Instructions
1.
Use the || operator and any two Boolean expressions of your choice between the
parentheses of System.out.println(); in order to print out a value of true or false to the console.
*/

public class Or {
	public static void main(String[] args) {

		System.out.println("dog" == "dog" || 12 == 13);

	}
}
