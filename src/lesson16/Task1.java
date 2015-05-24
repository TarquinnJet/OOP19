package lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
	public static void main(String[] args) {
		String str = "qwerty $34.43. fnjksk kjnskjnf njfn j njfks $23";
		System.out.println(str.matches("qwe.{3}"));
		String regex = "\\$[0-9]+(\\.[0-9]+)?";
		String res = str.replaceAll(regex, "\\$???");
		System.out.println(res);
		Pattern p = Pattern.compile("\\$[0-9]+(\\.[0-9]+)?");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
		}
	}
}
