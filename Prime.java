package prechec;

public class Prime {

	public static void main(String[] args) {
		 int nValues = 50;
	        //here we are using outerloop as we have using continue keyword
	        outerloop:
	        for (int i = 2; i <= nValues; i++) {
	            // Removing isPrime variable

	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    continue outerloop; 
	                }
	            }

	            System.out.println(i);
	        }
	    }
	}

