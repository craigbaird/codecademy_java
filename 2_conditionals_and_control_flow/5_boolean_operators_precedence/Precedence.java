/*
The three Boolean operators &&, ||, and ! can also be used together and used
multiple times to form larger Boolean expressions.

However, just like numerical operators, Boolean operators follow rules that
specify the order in which they are evaluated. This order is called Boolean
operator precedence.

The precedence of each Boolean operator is as follows:

! is evaluated first
&& is evaluated second
|| is evaluated third
Like numerical expressions, every expression within parentheses is evaluated
first. Expressions are also read from left to right.

The following statement demonstrates how Boolean operator precedence works:

System.out.println( !(false) || true && false);
The example above will print out true. In order, the expression is evaluated
as follows:

First, the ! Boolean operator in !(false) returns true.
Second, true && false evaluates to false.
Finally, the remaining expression true || false evaluates to true.
Instructions
1.
Line 4 has a code statement that is incomplete. Use each Boolean operator no
more than once to replace the empty comments . The code statement should print out false.
*/

public class Precedence {
	public static void main(String[] args) {

		boolean riddle = !( 1 < 8 && (5 > 2 || 3 < 5));
		System.out.println(riddle);

	}
}
