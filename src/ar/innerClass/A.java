package ar.innerClass;

public class A {
	private int i;
	
	public class B {
		public int j=5;
	}
	
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.i =1;
		System.out.println(A.B.class);
		//A.B obj2 = new B();
		//System.out.println(obj2.j);
	}
}
