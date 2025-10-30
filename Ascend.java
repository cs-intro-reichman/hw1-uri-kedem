// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int num1 = (int) (Math.random() * lim);
		int num2 = (int) (Math.random() * lim);
		int num3 = (int) (Math.random() * lim);
		int smallest = Math.min(num1, Math.min(num2, num3));
		int largest = Math.max(num1, Math.max(num2, num3));
		int middle = num1 + num2 + num3 - smallest - largest;
		int breaker = 0;

		while (lim > 0 && breaker < 1) {
			System.out.println(num1 + " " + num2 + " " + num3);
			System.out.println(smallest + " " + middle + " " + largest);
			breaker++;

		}
	}
}
