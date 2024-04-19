package chapter8;

// Strings

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Test Automation University");
        System.out.println();
        reverseString("Hello TAU!");
//        System.out.println();
        addSpaces("HeyWorld!It'sMeIvan");
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int nrOfWords = words.length;

        String message = String.format("Your text contains %d words:", nrOfWords);
        System.out.println(message);

        for (int i = 0; i < nrOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to be reversed
     */
    public static void reverseString(String text) {
        for (int i = text.length()-1; i >= 0 ; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");  // inserting empty space before upper case letter
                i++;                              // skipping new space
            }
        }
        System.out.println(modifiedText);
    }

}
