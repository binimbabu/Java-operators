Java Operators and Assignments

Increment and Decrement Operators 

Increment and Decrement Operators are also called Unary operator because operator done in a single operand. Increment Operator are of 2 types preincrement (y = ++x;) and postincrement (y = x++;). Decrement operator are of 2 types predecrement (y = --x;) and postdecrement (y = x--;). Preincrement does the increment of operand before expresiion is evalauted (i.e in  'y = ++x;' first 'x' value incremented by 1 then assigned to 'y'). In postincrement first the expresiion is evalauted  then the value is incremnted(i.e in  'y = x++;' first 'x' value assigned to 'y' then x value incremented by 1).  Predecrement does the decrement of operand before expresiion is evalauted (i.e in  'y = --x;' first 'x' value decremented by 1 then assigned to 'y'). In postdecrement first the expresiion is evalauted  then the value is decremnted(i.e in  'y = x++;' first 'x' value assigned to 'y' then x value decremented by 1).
Increment and decrement can be only applied to operands not literals(i.e 10++ not possible) and not applicable to constants.

package com.bini.babu;

public class UnaryOperators {

	public static void main(String[] args) {
      int x=10;
      int y =++x;
      System.out.println("Value of x " + x);
      System.out.println("Value of y " + y);
      
      int a=10;
      int b =a++;
      System.out.println("Value of a " + a);
      System.out.println("Value of b " + b);
      
      int c=10;
      int d =--c;
      System.out.println("Value of x " + c);
      System.out.println("Value of y " + d);
      
      int e=10;
      int f =e--;
      System.out.println("Value of e " + e);
      System.out.println("Value of f " + f);
	}

}


Output

Value of x 11
Value of y 11
Value of a 11
Value of b 10
Value of x 9
Value of y 9
Value of e 9
Value of f 10



Arithmetic operators

Arithmetic operators are +,-,/,*,%.


package com.bini.babu;

public class ArithmeticOperators {

	public static void main(String[] args) {
     int x= 10, y= 10;
     System.out.println("Addition: " + (x+y));
     System.out.println("Subtraction: " + (x-y));
     System.out.println("Multiplication: " + (x*y));
     System.out.println("Division: " + (x/y));
     System.out.println("Reminder: " + (x%y));
	}

}


Output

Addition: 20
Subtraction: 0
Multiplication: 100
Division: 1
Reminder: 0



String concatenation operator

Example ( 2+4 = 6   i.e here its adds 2 numbers) , another example ("ac" + "bd" = acbd   i.e concatenates 2 strings).


package com.bini.babu;

public class StringConcatenation {
	public static void main(String[] args) {
     String s1="abc";
     String s2="def";
     System.out.println(s1+s2);
  
     int a =10, b=20, c=30;
     System.out.println(a+b+c);

     System.out.println(s1+a+b+c);

     System.out.println(a+b+s1+c);

     System.out.println(a+s1+b+c);
	}
}



Output

abcdef
60
abc102030
30abc30
10abc2030

In the above code since s1 (i.e s1="abc" )and s2 (i.e s2="def" ) is string and hence s1+s2 will concatenate , since s1 and s2 is string.
In the above code since a (i.e s1=10 ), b (i.e b=20 )and c (i.e c=30 ) is int and hence a+b+c will add , since a,b and c is int.

's1+a+b+c' here 1st operand is string  (here s1) .Since the expression is done from left to right and here the s1 (is a string) is concatenated with a, b and c because s1 starts a s string rest will be concatenated as string eventhough a,b, c are int. Thus, the output is abc102030.


Comparison operators

<,<=,>,>= are applied to all primitive types except boolean. 
==, != can be applied to primitive data types. 
== can also applied to objects. (to check if 2 objects points to the same memory location).


package com.bini.babu;

public class RelationalOperators {

	public static void main(String[] args) {
     System.out.println(10 <= 20);
     System.out.println('a' < 10);
     System.out.println('a' > 'A');
     System.out.println('a' > 900);
     
     System.out.println((int)'a');
     System.out.println((int)'A');
	}

}


Output

true
false
true
false
97
65


'a' < 10 is false because 'a' value is 97 and 97 is not less than 10.
'a' > 'A' is true because 'a' value is 97 and 'A' value is 65, 97>65 hence true.
'a' > 900 is false because 'a' value is 97 and 97 is not greater than 900.



Bitwise Operators - both the arguments are evaluated. Performance is slow when using bitwise operators. Applicable to apply both in integer and boolean arguments.


& (AND operator) = return true if both arguments are true and return if either 1 argument is false.
| (OR operator) = return true if atleast one argument is true and return false if both the arguments are false.
^ (XOR operator) = return true if both the arguments are different ( example true and false returns true, false and true returns true, true and true returns false, false and false returns false).

package com.bini.babu;

public class BitwiseOperators {

	public static void main(String[] args) {
      System.out.println(true & false);
      System.out.println(true & true);
      System.out.println(true | false);
      System.out.println(false  | false);
      System.out.println(true ^ false);
      System.out.println(false  ^ false);
	}

}


Output

false
true
true
false
true
false
4
5
1



4&5 (and operation done in binary numbers)  = 4
   
100
101
___
100

4|5 (or operation in binary numbers) = 5

100
101
___
101

4^5 (XOR operation in binary number)  = 1

100
101
___
001



Bitwise Unary Complement (i.e   ~) - flip 0 to 1 and 1 to 0.

10001  = 01110


Boolean complement (i.e   !) -   true to false or false to true.



Short circuit operators - (i.e &&, || ) - which is applied on Boolean arguments. Improves the performance of application. Second argument is optional. Performance is slow when using short circuit operators. Applicable to apply both in boolean arguments.



package com.bini.babu;

public class ShortCircuitOperators {

	public static void main(String[] args) {
     boolean x = true, y= false;
     if(x && y) {
    	 System.out.println("Inside if");
     }
     else{
    	 System.out.println("Inside else");
     }
	}

}


&&  - if one of them is false then the result is false, here y is false hence checks both x and y  (example above (x && y) = false).

||  - if one of them is true then its true, here x is true so doesn't check the y (example above (x || y) = true ).


Assignment Operator

package com.bini.babu;

public class AssignmentOperator {

	public static void main(String[] args) {
		int x, y, z;
		x = y = z = 200;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		int b=20;
		b += 40; // compound operator b = b +40
		System.out.println(b);
	}

}


Output

200
200
200
60


Ternary Operator

testExpression ? value1: value2;

testExpression should be evaluated to a Boolean value that is true or false. if testExpression is true then the result of the expression is value1. If the testExpression is false then the expression result is value2.


package com.bini.babu;

public class TernaryOperator {

	public static void main(String[] args) {
		int x = 20, y = 30;
		String result = (x > y) ? "x is greater" : "y is greater";
		System.out.println("Result " + result);
	}

}



Output

Result y is greater



Body Mass Index program


package com.bini.babu;

public class BodyMassndex {

	public static void main(String[] args) {
		// bmi = weitght in kg / (height * height);
		double height = 6.2; // height in feet
		double weight = 85;
		double heightInMeters = height * 0.4536;
        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("BMI: " + bmi);
	}
}


Output

BMI: 10.74705459131343

