package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {

		// NUMERIC
		Pattern pNum = Pattern.compile("[0-9]");
		Matcher mNum = pNum.matcher("7");
		boolean boolNum = mNum.matches();
		String x = (boolNum) ? "match" : "dont match";
		System.out.println(x);
		//

		// ALPHA
		Pattern pAlpha = Pattern.compile("[a-zA-z]");
		Matcher mAlpha = pAlpha.matcher("B");
		boolean bAlpha = mAlpha.matches();
		String a = (bAlpha) ? "match" : "dont match";
		System.out.println(a);
		//
	}
}
