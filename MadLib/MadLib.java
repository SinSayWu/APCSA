import java.util.Scanner;

public class MadLib {
    // MEthod to find placeholder and replace
    public static String libber(String start, int num, String replaced) {
        int startInd = start.indexOf("[" + num);
        int endInd = start.indexOf("]", startInd);
        // Before and After Text
        String before = start.substring(0, startInd);
        String after = start.substring(endInd + 1);
        start = before + replaced + after;

        return start;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String storyDOI = "We hold these truths to be self-evident, that all [0] are created equal, that they are endowed by their [1] with certain unalienable [2], that among these are [3], [4] and the pursuit of [5]. That to secure these rights, [6] are instituted among [0], deriving their just powers from the [7] of the governed, That whenever any Form of [6] becomes destructive of these ends, it is the Right of the [9] to alter or to abolish it, and to institute new [6], laying its foundation on such principles and organizing its [8] in such form, as to them shall seem most likely to effect their [4] and [5].";

        // Display Original storyDOI, Before placeholders
        System.out.println(storyDOI);
        System.out.println();

        // Prompt User for Each Word
        System.out.print("Gimme a plural noun: ");
        String word0 = input.nextLine();

        System.out.print("Gimme a singular noun: ");
        String word1 = input.nextLine();
        
        System.out.print("Gimme a plural noun: ");
        String word2 = input.nextLine();

        System.out.print("Gimme a plural noun: ");
        String word3 = input.nextLine();

        System.out.print("Gimme a plural noun: ");
        String word4 = input.nextLine();

        System.out.print("Gimme a plural noun: ");
        String word5 = input.nextLine();

        System.out.print("Gimme a plural noun: ");
        String word6 = input.nextLine();

        System.out.print("Gimme a singular noun: ");
        String word7 = input.nextLine();

        System.out.print("Gimme a singular noun: ");
        String word8 = input.nextLine();

        System.out.print("Gimme a singular noun: ");
        String word9 = input.nextLine();

        // String Methods to Replace, Process user type, and keep original string
        storyDOI = libber(storyDOI, 0, word0);
        storyDOI = libber(storyDOI, 0, word0);
        storyDOI = libber(storyDOI, 1, word1);
        storyDOI = libber(storyDOI, 2, word2);
        storyDOI = libber(storyDOI, 3, word3);
        storyDOI = libber(storyDOI, 4, word4);
        storyDOI = libber(storyDOI, 4, word4);
        storyDOI = libber(storyDOI, 5, word5);
        storyDOI = libber(storyDOI, 5, word5);
        storyDOI = libber(storyDOI, 6, word6);
        storyDOI = libber(storyDOI, 6, word6);
        storyDOI = libber(storyDOI, 6, word6);
        storyDOI = libber(storyDOI, 7, word7);
        storyDOI = libber(storyDOI, 8, word8);
        storyDOI = libber(storyDOI, 9, word9);

        // After Placeholder changes, Displayed finished madlib
        System.out.println();
        System.out.println(storyDOI);
        input.close();
    }
}