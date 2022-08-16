import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	private static String[] words = {"java", "rain", "BigO", "test", "Imposter", "water" };
	private static String word = words[(int) (Math.random() * words.length)];
	private static String dashes = new String(new char[word.length()]).replace("\0", "-");
	private static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (count < 4 && dashes.contains("-")) {
			System.out.println("Guess any letter in the word");
			System.out.println(dashes);
			String guesses = scan.next();
			hangman(guesses);
		}
		scan.close();
	}
	Sound play = new Sound("Music.wav");
	

	
	


	public static void hangman(String guess) {
		String newdash = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess.charAt(0)) {
				newdash += guess.charAt(0);
			} else if (dashes.charAt(i) != '-') {
				newdash += word.charAt(i);
			} else {
				newdash += "-";
			}
		}

		if (dashes.equals(newdash)) {
			count++;
			hangmanImage();
		} else {
			dashes = newdash;
		}
		if (dashes.equals(word)) {
			System.out.println("Correct! You win! The word was " + word);
		}
	}
	

	public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
		}


		if (count == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   | 		   o");
			System.out.println("   |           |");
			System.out.println("   | ");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   | 		   o");
			System.out.println("   |           |");
			System.out.println("   |          / \\");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   | 		   o");
			System.out.println("   |          /|");
			System.out.println("   |          / \\");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   | 		   o");
			System.out.println("   |          /|\\");
			System.out.println("   |          / \\");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
		}
	}

}
