package clc;

import java.util.Scanner;

public class Interface {
	
    public static void main(String[] args)
    {
	int num1;
	int num2;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("please enter the first number");
    num1 = input.nextInt();
    System.out.println("please enter the second number");
    num2 = input.nextInt();
    System.out.println(Math.add(num1, num2));
    
    input.close();
    }
}
