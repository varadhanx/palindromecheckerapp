public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Step 1: Store a predefined (hardcoded) string
        String input = "madam";

        System.out.println("======================================");
        System.out.println("Use Case 2: Hardcoded Palindrome Check");
        System.out.println("Input String: " + input);
        System.out.println("======================================");

        // Step 2: Assume it is a palindrome initially
        boolean isPalindrome = true;

        // Step 3: Loop only till half of the string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from start and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;  // No need to continue if mismatch found
            }
        }
    }
}
