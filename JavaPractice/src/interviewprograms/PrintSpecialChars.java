package interviewprograms;

public class PrintSpecialChars {
	
	public static void main(String[] args) {
        String s = "a%#7b*&^c";
        
        // Create a StringBuilder to store special characters
        StringBuilder specialChars = new StringBuilder();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is not a letter, digit, or whitespace
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                // Append special character to the StringBuilder
                specialChars.append(c);
            }
        }
        
        // Print the special characters
        System.out.println("Special characters: " + specialChars.toString());
    }
}
