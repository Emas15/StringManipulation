import java.util.Scanner;

public class AvoidingSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
    
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Step 2: Initialize variables
        String currentWord = "";  // To store the current word being processed
        String result = "";       // To store the final result of words

        // Step 3: Traverse the string character by character
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Step 4: Check if the character is a space (delimiter)
            if (ch == ' ') {
                // If we find a space, it means we have completed the current word
                if (!currentWord.equals("")) {
                    result += currentWord + " "; // Add the word to the result
                    currentWord = ""; // Reset current word for the next word
                }
            } else {
                // Otherwise, add the character to the current word
                currentWord += ch;
            }
        }

        // Step 5: Add the last word to result (if there’s any)
        if (!currentWord.equals("")) {
            result += currentWord;
        }

        // Step 6: Print the result (words from the string)
        System.out.println("Words in the sentence: " + result);
        sc.close();
    }
}
