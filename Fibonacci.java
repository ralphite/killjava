public class Fibonacci {
	int a, b;
	{
		a = 1;
		b = 1;
	}
	public int next() {
		int t = a;
		a = b;
		b = t + b;
		return a;
	}
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		int f = 1;
		while(f<100) {
			System.out.print(f + " ");
			f = fib.next();
		}
	}
}
