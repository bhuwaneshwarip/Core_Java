import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		
		int i=1,f=1;
		int n=sc.nextInt();
		/*for(i=1;i<=n;i++) {
			f=f*i;
		}
		*/
		while(i<=n) {
			f=f*i;
			i++;
		}
		System.out.println("Factorial " +f);
		
	}

}
