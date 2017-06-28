/*
Great work! Control flow allows Java programs to execute code blocks depending
on Boolean expressions. What did we learn about control flow so far?

Boolean Operators: &&, ||, and ! are used to build Boolean expressions and have
a defined order of operations
Statements: if, if/else, and if/else if/else statements are used to conditionally
execute blocks of code
Ternary Conditional: a shortened version of an if/else statement that returns a
value based on the value of a Boolean expression
Switch: allows us to check equality of a variable or expression with a value that
does not need to be a Boolean
1.
Use the precedence rules to help you evaluate the Boolean expression in the single
line comment above the tricky variable.

Then, set the boolean variable tricky equal to the result (either true or false).
2.
Change the Boolean expression in the if statement so that your program will print
out the code in the else block instead.
3.
Set the value of the int variable subwayTrain equal to the case that will print
"This is a Brooklyn bound train!" to the console.
*/

public class GeneralizationsB {
	public static void main(String[] args) {

	// ( 3 >= 3 && !(true || true) )
	boolean tricky = false;

	if(2015 == 2016) {

			System.out.println("Stuck in the past...");

		}else {

			System.out.println("Upgraded to the future!");

		}


	int subwayTrain = 5;

		switch (subwayTrain){

			case 1 : System.out.println("This is a South Ferry bound train!");
								break;
			case 5 : System.out.println("This is a Brooklyn bound train!");
								break;
			case 7 : System.out.println("This is a Queens bound train!");
								break;
			default:
				System.out.println("I'm not sure where that train goes...");

		}

	}
}
