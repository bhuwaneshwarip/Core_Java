import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Name :");
		String name = in.nextLine();
		System.out.print("Enter Age :");
		int age = in.nextInt();
		System.out.println("Name =" + name);
		System.out.println("Age =" + age);

	}

}
