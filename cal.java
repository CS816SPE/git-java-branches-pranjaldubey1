import java.util.Scanner;
public class cal
{
	public static void main(String[] args)
	{
		float a, b, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Calculator\n\n");
		do
		{
			System.out.println("1. Add 2 Numbers \n");
			System.out.println("2. Mutliply 2 Numbers \n");
			System.out.println("2. Sub 2 Numbers \n");
			System.out.println("3. Exit \n\n");
			System.out.println("Enter Your Choice: ");
			choice = scan.next().charAt(0);
			switch(choice)
			{
				case '1' :	System.out.println("Enter 2 Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a + b;
							System.out.println("Result = " + res);
							break;

				case '2' :	System.out.println("Enter 2 Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a * b;
							System.out.println("Result = " + res);
							break;

				case '3' :	System.exit(0);
							break;
							
				case '5' :	System.out.println("Enter 2 Numbers: ");
							a = scan.nextFloat();
							b = scan.nextFloat();
							res = a - b;
							System.out.println("Result = " + res);
							break;

				default  :	System.out.println("Invalid Choice!!!");
							break;
			}
			System.out.println("\n ------------------------- \n");

		}while(choice != 3);
	}
}
