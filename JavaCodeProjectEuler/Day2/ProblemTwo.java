/*	Day2 - Prblem 2
	Problem statement:
	By considering the terms in the Fibonacci sequence whose values do not exceed
	four million, find the sum of the even-valued term.

*/


public class ProblemTwo {

	public static void problemTwoSolution() {
		
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		int sumeven = 0;
		while(sum < 4000000){
		    num1 = num2;
		    num2 = sum;
		    sum = num1 + num2;
		    if(sum % 2 == 0){
		        sumeven += sum;
		    }
		}
		System.out.println(sumeven);
	}
		
	
	public static void main(String[] args) {

		problemTwoSolution();
		
		
	}

}
