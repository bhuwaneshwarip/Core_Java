import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int number=s.nextInt();
		int result = (number>>1);
		System.out.println("leftshift:"+result);
		int output = (number<<2);
		System.out.println("rightshift:"+output);
		
		
				
		


	}

}
