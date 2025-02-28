/**
 * CS152 Lab 4 -- Welcome to Methods.
 * <p>
 * Implementing the methods described below with TODO comments
 * <p>
 * Student name: Anuj Bhattarai (Akin)
 */
public class MethodPractice {

    // The next few methods are just for keeping track of test
    // results, so leave them alone.
    // Variables to keep track of the tests in main
    private static int correctTests = 0;
    private static int totalTests = 0;

    /**
     * Clear test count variables
     */
    private static void clearCounts() {
        correctTests = 0;
        totalTests = 0;
    }

    /**
     * Update test count variables depending on if test passed.
     *
     * @param correct True if test counts as correct.
     */
    private static void countTest(boolean correct) {
        if (correct) {
            correctTests++;
        }
        totalTests++;
    }

    /**
     * Print the testing results and return if all passed.
     *
     * @return True if all tests passed.
     */
    private static boolean checkResults() {
        System.out.println("Your program passes " + correctTests + " out of " + totalTests + " tests");
        return correctTests == totalTests;
    }

    // implementing the methods below

    /**
     * Returns largest of its arguments.
     *
     * @param x First argument
     * @param y Second argument
     * @param z Third argument
     * @return Maximum of x, y and z
     */
    public static int maxOfThree(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    /**
     * Is the character given a vowel?
     * A vowel is one of a, e, i, o, or u (upper or lower case)
     *
     * @param c Character to check
     * @return True if c is a vowel, false if not
     */
    public static boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    /**
     * location of the last vowel in the given string
     *
     * @param x String to check
     * @return 0 based location of last occurance of a vowel in x,
     * -1 if there are no vowels present.
     */
    public static int indexOfLastVowel(String x) {
        int i = x.length() - 1;
        while (i >= 0) {
            if (isVowel(x.charAt(i))) {
                return i;
            }
            i--;
        }
        return -1;
    }


    /**
     * Flip character's case between upper and lower.
     * If lowercase, return uppercase equivalent.
     * If uppercase, return lowercase equivalent.
     * If not a letter, return unchanged.
     * <p>
     * Note that this is an overloaded method
     *
     * @param c Character to process
     * @return Character with case switched.
     */
    public static char toggleCase(char c) {
        if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        }
        return c; // Returning unchanged if not a letter

    }

    /**
     * Return a string with each lowercase letter
     * converted to uppercase, each uppercase letter
     * switched to lowercase, and each non-letter
     * character left unchanged
     * <p>
     * Note that this is an overloaded method
     *
     * @param s The string to process
     * @return New string with upper and lower case switched.
     */

    public static String toggleCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(toggleCase(s.charAt(i)));  // Use the char version
        }
        return result.toString();
    }

    /**
     * Average up to five even numbers. Any odd values are
     * not included in the average.
     *
     * @param a First value
     * @param b Second value
     * @param c Third value
     * @param d Fourth value
     * @param e Fifth value
     * @return Average of the even input values. If none are even, returns -1000.
     */
    public static double averageEvenNumbers(int a, int b, int c, int d, int e) {
        int sum = 0;
        int counter = 0;

        if (a % 2 == 0) {
            sum = sum + a;
            counter++;
        }
        if (b % 2 == 0) {
            sum = sum + b;
            counter++;
        }
        if (c % 2 == 0) {
            sum = sum + c;
            counter++;
        }
        if (d % 2 == 0) {
            sum = sum + d;
            counter++;
        }
        if (e % 2 == 0) {
            sum = sum + e;
            counter++;
        }
        //Now returning the value
        if (counter == 0) {
            return -1000;
        } else {
            return (double) sum / counter;
        }
        // Returning a value to make the file compile

    }


    //
    // Writing a method call countVowels that returns the number
    // of vowels in the given string.
    //

    /**
     * This method counts and returns the number of vowels
     * in a given string. The vowels considered are 'a', 'e', 'i', 'o', 'u',
     * both uppercase and lowercase.
     * <p>
     * The method works by iterating through each character of the string,
     * converting it to lowercase to ensure case insensitivity, and checking
     * if the character is a vowel. If it is, the counter is incremented.
     *
     * @param str The string in which vowels will be counted.
     * @return Total number of vowels present in the input string.
     */
    public static int countVowels(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            //retriving character from position i from the string
            //by using charAt()
            //converting character into lowercase
            char c = Character.toLowerCase(str.charAt(i));
            //checking the character if its a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                counter++;
            }
        }
        return counter;
    }



    /**
     * This method calculates the total cost of a meal including the tip.
     * It takes the base cost of the meal and a tip percentage, and returns
     * the total amount that should be paid.
     * <p>
     * The method checks that the meal cost is greater than 0 and that the
     * tip percentage is between 0 and 0.9 (inclusive). If either of these
     * conditions is not met, the method returns -1 to indicate an invalid input.
     *
     * @param meal The cost of the meal as an integer.
     * @param tip  The tip percentage as a double.
     * @return The total bill amount as a double.
     */
    public static double computeMealBill(int meal, double tip) {
        if (meal > 0 && tip >= 0 && tip <= 0.9) {
            return meal + (meal * tip);
        }
        return -1;

    }


    /**
     * This code tests your program's completeness.
     *
     * @param args Ignored
     */
    public static void main(String[] args) {
        // Some lines in this method may be over 80 chars, but I chose to
        // do that to make it easier to comment out individual
        // tests. The course coding standards still apply to the code
        // that you write in the methods above

        int goodMethods = 0;

        clearCounts();
        System.out.println("testing maxOfThree");
        countTest(maxOfThree(1, 2, 3) == 3);
        countTest(maxOfThree(1, 3, 2) == 3);
        countTest(maxOfThree(3, 2, 1) == 3);
        countTest(maxOfThree(4, -5, 3) == 4);
        countTest(maxOfThree(5, 7, 0) == 7);
        countTest(maxOfThree(-1, -2, 3) == 3);
        countTest(maxOfThree(-1, -2, -3) == -1);
        if (checkResults()) {
            goodMethods++;
        }

        clearCounts();
        System.out.println("testing isVowel");
        countTest(!isVowel('x'));
        countTest(!isVowel('5'));
        countTest(!isVowel('&'));
        countTest(isVowel('A'));
        countTest(isVowel('a'));
        countTest(isVowel('E'));
        countTest(isVowel('i'));
        countTest(isVowel('o'));
        countTest(isVowel('U'));
        if (checkResults()) {
            goodMethods++;
        }

        clearCounts();
        System.out.println("testing indexOfLastVowel");
        countTest(indexOfLastVowel("") == -1);
        countTest(indexOfLastVowel("banana") == 5);
        countTest(indexOfLastVowel("BONOBO") == 5);
        countTest(indexOfLastVowel("Old") == 0);
        countTest(indexOfLastVowel("L33T rhythm") == -1);
        countTest(indexOfLastVowel("rhythm and blues") == 14);
        countTest(indexOfLastVowel("One TWO 3 four FIVE") == 18);
        if (checkResults()) {
            goodMethods++;
        }

        clearCounts();
        System.out.println("testing toggleCase (char version)");
        countTest(toggleCase('A') == 'a');
        countTest(toggleCase('m') == 'M');
        countTest(toggleCase('9') == '9');
        countTest(toggleCase('%') == '%');
        if (checkResults()) {
            goodMethods++;
        }

        clearCounts();
        System.out.println("testing toggleCase (String version)");
        countTest(toggleCase("").equals(""));
        countTest(toggleCase("abcdeFGHIJkLMn12345^&*()").equals("ABCDEfghijKlmN12345^&*()"));
        countTest(toggleCase("Hello, World!").equals("hELLO, wORLD!"));
        countTest(toggleCase("1 dAy We AlL sTaRtEd TyPiNg LiKe ThIs.").equals("1 DaY wE aLl StArTeD tYpInG lIkE tHiS."));
        countTest(toggleCase("Sphinx of Black Quartz, Judge My Vow").equals("sPHINX OF bLACK qUARTZ, jUDGE mY vOW"));
        if (checkResults()) {
            goodMethods++;
        }

        clearCounts();
        System.out.println("testing averageEvenNumbers");
        countTest(averageEvenNumbers(12, 13, 12, 13, 12) == 12.0);
        countTest(averageEvenNumbers(-1, 3, -5, 7, 9) == -1000.0);
        countTest(averageEvenNumbers(0, 0, 15, 0, -2) == -0.5);
        countTest(averageEvenNumbers(100, -3, 402, -2, 10) == 127.5);
        countTest(averageEvenNumbers(2, 0, 0, 0, -2) == 0.0);
        if (checkResults()) {
            goodMethods++;
        }


//         Uncomment these tests AFTER IMPLEMENTING countVowels
        clearCounts();
        System.out.println("testing countVowels");
        countTest(countVowels("L33T rhythm") == 0);
        countTest(countVowels("abcdefghijklmNOPQRSTUVWZYZ") == 5);
        countTest(countVowels("One TWO 3 four FIVE") == 7);
        if (checkResults()) {
            goodMethods++;
        }

        // Uncomment these tests AFTER IMPLEMENTING computeMealBill
        clearCounts();
        System.out.println("testing computeMealBill");
        countTest(computeMealBill(0, 0.3) == -1.0);
        countTest(computeMealBill(10, 0.25) == 12.5);
        countTest(computeMealBill(100, 0.5) == 150.0);
        countTest(computeMealBill(100, 0.9) == 190.0);
        countTest(computeMealBill(100, 0.91) == -1.0);
        countTest(computeMealBill(120, 0.32) == 158.4);
        if (checkResults()) {
            goodMethods++;
        }

        System.out.println();
        System.out.println(goodMethods + "/8 methods pass tests");
    }

}