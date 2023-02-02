package practice;
import java.util.Scanner;

interface Calculator
{
	void add();
	void sub1();
}
   class Mycalculator11 implements Calculator
{
	public void add()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the 1st number");
		int a = scan.nextInt();
		System.out.println("Please enter the 2nd number");
		int b = scan.nextInt();
		int c = a+b;
		System.out.println("The addition of two number is "+ c);

	}
	public void sub1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the 1st number");
		int a = scan.nextInt();
		System.out.println("Please enter the 2nd number");
		int b = scan.nextInt();
		int c = a - b;
		System.out.println("The substraction of two numbers is " + c);
		
		System.out.println("************************");
	}
	
}
   
class Mycalculator2 implements Calculator
{
	public void add()
	{
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("The addition of two number is " + c);
	}

	public void sub1()
	{
		int a=10;
		int b=20;
		int c= a-b;
		System.out.println("The substraction of two numbers is " + c);
	}

	
}

class cal
{
	public void permit(Calculator ref)
	{
		ref.add();
		ref.sub1();
	}
}
public class LaunchIF {

	public static void main(String[] args) {
		
		Mycalculator11 m1 = new Mycalculator11();
		Mycalculator2 m2 = new Mycalculator2();
		cal c = new cal();
		c.permit(m1);
		c.permit(m2);
	}

}
