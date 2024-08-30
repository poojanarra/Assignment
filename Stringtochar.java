package method;

public class Stringtochar {
	public static void main(String[] args) {
		String input="hello";
		char[] charArray =input.toCharArray();
		System.out.println("char array");
		for(char c: charArray) {
			System.out.println(c+"");
		}
	}
}
