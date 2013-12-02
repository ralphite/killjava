public class Fb1 {
	public static void main(String[] args) {
		int n = 0;
		try {
			n = (int)args[0];
		}
		catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		
	}
}