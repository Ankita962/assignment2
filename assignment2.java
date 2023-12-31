// 1.What are the conditional operator in java ?
//   In Java , the conditional operators are used to perform logical comparisons and make decisions based on the result .
//   These operators are: ==, !=, >, <, >=, <=
// 2.What are the types of operators based on the number of operands ?
//   Based on the number of operands , operators in Java is classified into three categories such as : Unary, binary & ternary operators.
//   a.Unary operators:(It work with single operand)  Increment(++) , Decrement(--), Unary minus(-), Unary plus(+), Logical complement (!).
//   b.Binary operators: :(It work with 2 operand)
//   Arithmeticoperators(+,-,*,/,%),
//   RelationalOperators(==,!=,>,<.<=,>=),
//   LogicalOperators(&&,||),
//   AssignmentOperator(=,++,-+,*=,/=),
//   Bitwiseoperators(&,|,^,~,<<,>>,>>>)
// c.Ternary operators: :(It work with 3 operand) 
//   syntax:
//   condition ? exp1 : exp2
// 3. What is the use of Switch case in Java Programming ?
//   The switch case statement in java is a control flow statement that allows to perform different actions based on different values of a expression .
//   It provides an alternative to using muliple if-else statements when we have a limited number of possible conditions to do.
// 4. What are the priority levels of arithmetic operation in java ?
//   Operators within higher precedence levels are evaluated before operators within lower precedence levels. 
//   The priority levels of arithmetic operations in Java, from highest to lowest precedence, are: parentheses, unary operators, multiplicative operators, additive operators, and assignment operators. 
//   Left-associativity is the default for most operators, except for the assignment operator, which is right-associative in nature. 
// 5. What are the conditional statements and use of conditional statements in Java ?
//   Conditional statements in Java are control flow statements that allow us to execute different blocks of code based on specified conditions. These are used to make decisions and perform different actions based on the evaluation of boolean expressions. It enhance the flexibility and logic of programs, enabling them to respond dynamically to different type ofscenarios.
// 6. What is the syntax of if-else statement ?
//  	Syntax for if-else statement:
// if (condition) {
//     // code to be executed if the condition is true
// } else {
//     // code to be executed if the condition is false
// }
// 7. What are the 3 types of iterative statements in java ?
//   a.for loop 
//   b.while loop 
//   c.do-while loop
// 8. Write difference  between for loop and do-while loop ?
//   A for loop allows us to initialize a counter variable, a check condition, and a way to increment the counter variable all in one line. 
//   Eg: 	for (int x = 0; x < 100; x++) {
//     	//it will executed until x >= 100 
//   }
//   A do-while loop will always execute the code in the do {} block first and then evaluate the condition. 
//   Eg:	do { 
//   //it is executed at least once 
//   } 
//   while (condition);

// 9. Write a program to print numbers from 1 to 10. 
  public class PrintNum {
    public static void main(String[ ] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            System.out.print(“ “);
        }
    }
}
// Output:
// 1 2 3 4 5 6 7 8 9 10