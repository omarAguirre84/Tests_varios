package ar.innerClass;

public class Equal_vs_igual_igual{

	public static void main(String[] args) {
		String mango = "mango";
		String mango2 = "mango";
		String mango3 = new String("mango");
		
		System.out.print("mango == mango2 " ); System.out.println(mango == mango2);
		
		System.out.print("mango.equals(mango2) " ); System.out.println(mango.equals(mango2));
		System.out.println();

		System.out.print("mango == mango3 "); System.out.println(mango == mango3);
		
		System.out.print("mango.equals(mango3) ");	System.out.println(mango.equals(mango3));
		
		System.out.println("\n"+"IdentityHashCode");
		System.out.println(System.identityHashCode(mango));
		System.out.println(System.identityHashCode(mango2));
		System.out.println(System.identityHashCode(mango3));
	}
}
