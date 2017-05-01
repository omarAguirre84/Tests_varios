package vector;

public class Test {

	public static void main(String[] args) {
		Integer [] v = new Integer [5];
		
		for (Integer x : v) {
			System.out.println(x);
		}
		
		for(int i=0; i < v.length; i++){
			System.out.println(i);
		}
	}

}
