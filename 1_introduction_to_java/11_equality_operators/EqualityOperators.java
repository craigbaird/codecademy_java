/*
You may have noticed that the relational operators did not include an operator
for testing "equals to". In Java, equality operators are used to test equality.

The equality operators are:

==: equal to.
!=: not equal to.
Equality operators do not require that operands share the same ordering. For
example, you can test equality across boolean, char, or int data types. The
example below combines assigning variables and using an equality operator:

char myChar = 'A';
int myInt = -2;
System.out.println(myChar == myInt);
The example above will print out false because the value of myChar ('A') is not
the same value as myInt ('-2').
Instructions
1.
Use any equality operator to directly compare two Boolean values. Do not declare
any variables.
*/

public class EqualityOperators {
	public static void main(String[] args) {

		System.out.println(true == false);

	}
}
