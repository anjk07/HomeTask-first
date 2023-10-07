package prechec;

public class Objectbubblesort {
			
    public static void main(String[] args) 
    {
				
	 String soliloquy = "To be or not to be, that is the question; "
				         + "Whether `tis nobler in the mind to suffer"
				         + " the slings and arrows of outrageous fortune,"
				         + " or to take arms against a sea of troubles,"
				         + " and by opposing end them?";

		String[] words = soliloquy.split("[\\s,;.`]+");

				  int n = words.length;
				  boolean swapped;
				  do {
				           swapped = false;
				           for (int i = 1; i < n; i++) {
				          if (words[i - 1].compareToIgnoreCase(words[i]) > 0) 
				                {
				                    String temp = words[i - 1];
				                    words[i - 1] = words[i];
				                    words[i] = temp;
				                    swapped = true;
				                }
				            }
				        } while (swapped);

				        for (String word : words) {
				            System.out.println(word);
				        }
				    }		
			
}


