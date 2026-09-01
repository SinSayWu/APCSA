import java.util.Scanner;

public class GuessChecker {
    public static void main(String[] args) {
        String secret = "4821";   // digits 1-9, all different
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-digit guess: ");
        String guess = input.nextLine();

        //TURN A 4 DIGIT SECRET NUMBER INTO 4 SEPARATE INT VARIABLES
        int s1 = (int) secret.charAt(0) - '0';
        int s2 = (int) secret.charAt(1) - '0';
        int s3 = (int) secret.charAt(2) - '0';
        int s4 = (int) secret.charAt(3) - '0';
        //TURN A 4 DIGIT GUESS INTO 4 SEPARATE INT VARIABLES 
        int g1 = (int) guess.charAt(0) - '0';
        int g2 = (int) guess.charAt(1) - '0';
        int g3 = (int) guess.charAt(2) - '0';
        int g4 = (int) guess.charAt(3) - '0';

        int bulls = 0;
        int cows = 0;

        // YOUR CHECKS GO HERE

        if (s1 == g1) bulls++;
        else if (g1 == s2 || g1 == s3 || g1 == s4) cows++;
        if (s2 == g2) bulls++;
        else if (g2 == s1 || g2 == s3 || g2 == s4) cows++;
        if (s3 == g3) bulls++;
        else if (g3 == s1 || g3 == s2 || g3 == s4) cows++;
        if (s4 == g4) bulls++;
        else if (g4 == s1 || g4 == s2 || g4 == s3) cows++;

        // print stuff
        System.out.println("Bulls: " + bulls);
        System.out.println("Cows: " + cows);
        System.out.println();

        // more stuff
        if (bulls == 4) System.out.println("You got the number!");
        else System.out.println("You got " + bulls + " bulls and " + cows + " cows!");

        if (bulls == 3) System.out.println("Almost there!");
        else if (bulls == 2) System.out.println("Halfway! Keep trying!");
        else if (bulls == 1) System.out.println("Bro try harder");
        else System.out.println("You are tryna Miles Morales me");

        input.close();
    }
}
