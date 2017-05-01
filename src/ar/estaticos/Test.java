package ar.estaticos;

public class Test {
	
	private int num1;
	private static int num2;
	
	public void increment(){
		num1++;
		num2++;
	}
	
	
	public static void main(String[] args) {
		
		Test obj1 = new Test();
		obj1.increment();
		System.out.println(Test.num2);
		
	}
}
