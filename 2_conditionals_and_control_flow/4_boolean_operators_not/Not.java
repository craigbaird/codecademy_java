/*
Fantastic! The final Boolean operator we will explore is called not.

The not operator is represented in Java by !.
It will return the opposite of the expression immediately after it. It will return false if the expression is true, and true if the expression is false.
The code below shows all the outcomes of the Boolean operator !:

//The "not" Boolean operator:

System.out.println(!false); // prints true
System.out.println(!true); // prints false
We can also use the Boolean operator ! with Boolean expressions such as the following:

System.out.println( !(4 <= 10) );
The example above will print out false because the statement "4 is less than or equal to 10" is true, but the ! operator will return the opposite value, which is false.
Instructions
1.
Use the ! operator to return a value of true for the code on line 4.
2.
Use the ! operator to return a value of false for the code on line 5.
*/

public class Not {
	public static void main(String[] args) {

		System.out.println(!false);
		System.out.println( !(5>=1) );

	}
}
