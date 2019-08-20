/* 	Day 1 - Problem 1
	
	Problem statement:
	Find the sum of all the multiples of 3 or 5 below 1000 

*/

function problemOneSolution() {

	var counter = 0;
	var total = 0;
	
	while(total < 1000) {
		if(total % 3 == 0 || total % 5 == 0) {
			counter += total;
		}
		total++;
	}
	console.log(counter);
}

problemOneSolution();
