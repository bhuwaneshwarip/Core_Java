
public class implicitandexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*short a=60;
		int b=a;
		long c=b;
		float d=c;
		double e=d;
		System.out.println("Int :"+b);
		System.out.println("Long :"+c);
		System.out.println("Float :"+d);
		System.out.println("Double :"+e);
*/
		
		double a=60;
		float b=(float)a;
		long c=(long)b;
		int d=(int)c;
		short e=(short)d;
		System.out.println("Double :"+a);
		System.out.println("Float :"+b);
		System.out.println("Long :"+c);
		System.out.println("Int :"+d);
		System.out.println("Short :"+e);
	}

}
