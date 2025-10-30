// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
		Double interest = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		int futureValue = (int) (currentValue * Math.pow((interest / 100) + 1, n));
		String result = "After " + n + " years, $" + currentValue + " saved at " + interest + "% will yield $"
				+ futureValue;

		if (interest <= 100 && interest >= 0) {
			System.out.println(result);
		} else {
			System.out.println("interest rate must be between 0 and 100.");

		}
	}
}