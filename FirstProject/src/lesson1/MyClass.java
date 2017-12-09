package lesson1;

import java.util.Scanner;

public class MyClass {
/*
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter some value");
int user_input=scan.nextInt();
System.out.println("the user has entered");
System.out.print(user_input);

Scanner scan1=new Scanner(System.in);
System.out.println("Enter some value");
double user_input_double=scan1.nextDouble();
System.out.println("the user has entered");
System.out.print(user_input_double);

Scanner scan2=new Scanner(System.in);
System.out.println("Enter some string");
String user_input_string=scan2.nextLine();
System.out.println("the user has entered");
System.out.print(user_input_string);
	}

}
