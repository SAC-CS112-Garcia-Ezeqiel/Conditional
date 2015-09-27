package simple;

import java.util.Scanner;

public class conditional {
	public static void main( String[] args) {
		
		Scanner me = new Scanner(System.in);
		
		System.out.print( "Enter First Number: ");
		String number1 = me.nextLine();
		
		System.out.print( "Enter Second Number: ");
		String number2 = me.nextLine();
		
		System.out.print( "Enter one of the following operations - + / * : ");
		String operation = me.nextLine();
		
		double answer;
		if(operation.equals("-"))
		{
			answer = Double.parseDouble( number1 ) - Double.parseDouble(  number2 );
			System.out.println( answer );
			
		
		}
		else if(operation.equals( "/"))
		{
			answer = Double.parseDouble( number1 ) / Double.parseDouble(  number2 );
			System.out.println( answer );
		}
		else if(operation.equals("+"))
		{
			answer = Double.parseDouble( number1 ) + Double.parseDouble(  number2 );
			System.out.println( answer );	
		}
		else if(operation.equals("*"))
		{
			answer = Double.parseDouble( number1 ) * Double.parseDouble(  number2 );
			System.out.println( answer );
		}
		else
		{
		System.out.println( "Invalid operator");
		
		}
		
		
		}
			
			
	}


