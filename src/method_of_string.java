import java.util.Scanner;

public class method_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string 1 :");
		String str1 = s.nextLine();
		System.out.println("Enter string 2 :");
		String str2 = s.nextLine();
		String str3 = str1 + str2;
		System.out.println("Length of string :" + str3.length());
		System.out.println("Uppercase of string :" + str3.toUpperCase());
		System.out.println("Lowercase of string :" + str3.toLowerCase());
		System.out.println("Resultant of string :" + str3);
		System.out.println("String starts with :" + str3.startsWith("He"));
		System.out.println("Index of string :" + str3.indexOf("o"));
		String s1 = "bhuwaneshwari";
		System.out.println("Concat"+str1.concat(s1));
		System.out.println("Index of :" + s1.indexOf('a'));
		System.out.println("Index of string from last :" + s1.lastIndexOf('a'));
		System.out.println("Replace :" + s1.replace('b', 'i'));

	}

}
