import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	static public List<Integer> findPrimes(int quantity) {
		System.out.println("Finding the first " + quantity + " prime numbers");
		List<Integer> primes = new ArrayList<>();
		primes.add(1);
		int number = 0;
		while (primes.size() < quantity) {
			int counter = 0;
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					counter++;
				}
			}
			if (counter == 2) primes.add(number);
			number++;
		}
		System.out.println("Size of the array is " + primes.size());
		return primes;
	}
}
