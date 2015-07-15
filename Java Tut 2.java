import java.util.Scanner;

public class HelloWorld {
		public static void main(String[] args){
			System.out.println("Hello World");
			Scanner input =  new Scanner(System.in);
			int ask;
			int ask2;
			System.out.println("Welcome to this calculator.");
			System.out.println("Please input a number to do addition.");
			ask = input.nextInt();
			System.out.println("Please imput the next number.");
			ask2 = input.nextInt();
			System.out.println( ask + ask2);
			
		}
}
