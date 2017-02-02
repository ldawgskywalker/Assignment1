import java.util.Scanner;
public class HangmanDemo {
	public static void main(String[] args){
		//DECLARE SCANNER
		Scanner kb = new Scanner(System.in);
		//DECLARE VARIABLES
		char g;
		String w="";
		//CREATE HANGMAN OBJECT 
		hangman dood = new hangman();
		dood.generateSecretWord();
		
		System.out.println("Welcome to the Hangman game.");
		System.out.println("I have a secret Pokemon character name. You have to guess it. "
							+ "You are allowed only six incorrect guesses.");
		
		
		
		
		while(6>dood.getNumIncorrect()){
			for(int i=0;i<dood.getDisguisedWord().length;){
				w+=dood.charAt(i);
			}
			System.out.println("Secret word: "+w);
			System.out.print("Enter a guess: ");
				g = kb.next().charAt(0);
			dood.makeGuess(g);
			dood.isFound(g);
		}
		
		
		
		kb.close();
	}
}
