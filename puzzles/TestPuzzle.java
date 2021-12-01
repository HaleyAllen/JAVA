import java.util.ArrayList;
import java.util.Random;

public class TestPuzzle {
    
    public static void main(String[] args) {
		
        Puzzle generator = new Puzzle();

		System.out.println();
        System.out.println("----- 10 Rolls -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		System.out.println();
		
        System.out.println("----- Random letter -----");
    	System.out.println(generator.getRandomLetter());
    	System.out.println();
        
        System.out.println("----- Generate random password -----");
        System.out.println(generator.generatePassword());
        System.out.println();

        System.out.println("----- Generate random 8 character words -----");
        System.out.println(generator.getNewPasswordSet(13));
        System.out.println();
	}
}