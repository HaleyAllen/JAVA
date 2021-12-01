import java.util.ArrayList;
import java.util.Random;

public class TestPuzzle {
    
    public static void main(String[] args) {
		
        Puzzle generator = new Puzzle();

		System.out.println();
        System.out.println("----- 10 Random Numbers between 1 and 20 -----");
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		System.out.println();
		
        System.out.println("----- Return one random letter -----");
    	System.out.println(generator.getOneLetter());
    	System.out.println();
        
        System.out.println("----- Generate a random 8 character password -----");
        System.out.println(generator.randomPassword());
        System.out.println();

        System.out.println("----- Generate X amount of random 8 character words -----");
        System.out.println(generator.getNewPasswordSet(5));
        System.out.println();
	}
}