package www.rays.com;

public class demorev {
	public static void main(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /= 10;
		}
			System.out.println(return reversed);
	}

}
