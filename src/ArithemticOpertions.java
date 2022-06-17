import java.util.Scanner;

public class ArithemticOpertions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;


		int choice;
		while (true) {

			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("5 for Squareroot");
			System.out.println("6 for Power");
			System.out.println("7 to Quit\n \n ");

			System.out.println("Enter your choice :");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter number a : ");
				a = sc.nextInt();
				System.out.println("Enter number b : ");
				b = sc.nextInt();
				c = a + b;
				System.out.println("Sum = " + c +"\n");
				break;

			case 2:
				System.out.println("Enter number a : ");
				a = sc.nextInt();
				System.out.println("Enter number b : ");
				b = sc.nextInt();
				c = a - b;
				System.out.println("Subtraction = " + c +"\n");
				break;

			case 3:
				System.out.println("Enter number a : ");
				a = sc.nextInt();
				System.out.println("Enter number b : ");
				b = sc.nextInt();
				c = a * b;
				System.out.println("Mul = " + c +"\n");
				break;
			case 4:
				System.out.println("Enter number a : ");
				a = sc.nextInt();
				System.out.println("Enter number b : ");
				b = sc.nextInt();
				if (b==0) {
					System.out.println("Invalid");
				}
				c = a / b;

				System.out.println("Div = " + c +"\n" );
				break;
			case 5:
			
				System.out.println("Enter number a : ");
				int s = sc.nextInt();		
				double squareRoot = Math.sqrt(s);
				System.out.println("Sqrt of a " +squareRoot+ "\n");

				break;
			case 6:
				System.out.println("Enter number a : ");
				a = sc.nextInt();
				System.out.println("Enter number b : ");
				b = sc.nextInt();
				double power= Math.pow(a,b);

				System.out.println("Power = " +power+"\n");
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("Out of loop. ");
			}
		}

	}

}
