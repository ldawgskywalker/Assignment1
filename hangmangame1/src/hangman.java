import java.util.Arrays;

public class hangman {
	//DECLARE VARIABLES
	private String[] secretWordDictionary = {"bulbasaur","ivysaur",
			"venusaur","charmander","charmeleon", "charizard", "squirtle",
			"wartortle", "blastoise", "caterpie", "metapod", "butterfree",
			"weedle", "kakuna", "beedrill", "pidgey", "pidgeotto",
			"pidgeot","rattata", "raticate", "spearow", "fearow", "ekans", "arbok",
			"pikachu"};
	private char[] secretWord;
	private char[] disguisedWord;
	private int numGuesses;
	private int numIncorrect;
	
	//NO-ARGS CONSTRUCTOR
	public hangman(){
		numGuesses   = 0;
		numIncorrect = 0; 
	}
	//SET AND GET METHODS
	public String[] getSecretWordDictionary() {
		return secretWordDictionary;
	}
	
	public char[] getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(char[] secretWord) {
		this.secretWord = secretWord;
	}

	public char[] getDisguisedWord() {
		return disguisedWord;
	}

	public void setDisguisedWord(char[] disguisedWord) {
		this.disguisedWord = disguisedWord;
	}

	public int getNumGuesses() {
		return numGuesses;
	}

	public void setNumGuesses(int numGuesses) {
		this.numGuesses = numGuesses;
	}

	public int getNumIncorrect() {
		return numIncorrect;
	}

	public void setNumIncorrect(int numIncorrect) {
		this.numIncorrect = numIncorrect;
	}
	// END OF SET AND GETS //
	
	//FINDS RANDOM WORD, APPLIES TO SECRETWORD[] 
	public void generateSecretWord(){
		String w = secretWordDictionary[(int) (Math.random()*24)];
		secretWord 	  = new char[w.length()];
		disguisedWord = new char[w.length()];
		
		for(int i=0; i<w.length();i++){
			secretWord[i] 	 = w.charAt(i);
			disguisedWord[i] = '?';
		}
		
	}
	
	public char charAt(int i){
		return disguisedWord[i];
		
	}
	
	//USER GUESSES IF CHAR IS IN WORD
	public char[] makeGuess(char c){
			numGuesses++;
			for(int i=0;i<secretWord.length;i++){
				if(secretWord[i]==c){
					disguisedWord[i] = c;
				}
			}
			
		return disguisedWord;
	}
	
	//IS CHAR FOUND
	public boolean isFound(char c){
		if(Arrays.asList(disguisedWord).contains(c)){
			return true;
		}
		else{
			numIncorrect++;
			return false;
		}
		
	}
	
	
}
