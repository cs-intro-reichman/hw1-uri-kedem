// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue = Integer.parseInt(args[0]);
		Double interest = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double futureValue = (currentValue * Math.pow((1 + interest), n) / 100);
		String result = "after " + n + " years, $" + currentValue + " saved at " + interest + "% interest will yield $"
				+ futureValue;

		if (interest <= 100 && interest >= 0) {
			System.out.println(result);
		} else {
			System.out.println("interest rate must be between 0 and 100.");

		}
	}
}