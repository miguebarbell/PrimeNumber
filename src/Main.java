public class Main {
	public static void main(String[] args) {
//		System.out.println("Hello world!");
		int quantity = 100;
		if (args.length > 0) {
			try {
				if (Integer.parseInt(args[0]) > 0) {
					quantity = Integer.parseInt(args[0]);
				} else {
					System.out.println("Quantity \"" + args[0]+ "\" must be greater than zero, running default settings...");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid integer \"" + args[0] +"\", running default settings...");
			}
		}
		System.out.println(PrimeNumbers.findPrimes(quantity));

	}
}
