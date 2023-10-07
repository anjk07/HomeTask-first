package prechec;

public class Object {

	public static void main(String[] args) {

		        String text = "To be or not to be, that is the question;"
		                + "Whether `tis nobler in the mind to suffer"
		                + " the slings and arrows of outrageous fortune,"
		                + " or to take arms against a sea of troubles,"
		                + " and by opposing end them?";
		        
		        int spaces = 0;
		        int vowels = 0;
		        int letters = 0;
		        
		        text = text.toLowerCase();

		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            
		            if (ch == ' ') {
		                spaces++;
		            } else if (ch >= 'a' && ch <= 'z') {
		                letters++;
		                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                    vowels++;
		                }
		            }
		        }

		        System.out.println("The text contained vowels: " + vowels);
		        System.out.println("Consonants: " + (letters - vowels));
		        System.out.println("Spaces: " + spaces);
		    }
		}

