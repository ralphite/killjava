public class StringReverse {
	public static String Reverse(String s) {
		int len = s.length();
		StringBuffer sb = new StringBuffer(len);
		for(int i = len - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(StringReverse.Reverse("abcdefg0123456"));
	}
}