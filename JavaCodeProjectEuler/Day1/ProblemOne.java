/* Find the sum of all the multiples of 3 or 5 below 1000 */

public class ProblemOne {

	public static void main(String[] args) {

		problemOneSolution();
	}

	private static void  problemOneSolution() {
		
		int counter = 0;
		int total = 0;
		
		while(total < 1000) {
			if(total % 3 == 0 || total % 5 == 0) {
				counter += total;
			}
			total++;
		}
		System.out.println(counter);
	}

}

