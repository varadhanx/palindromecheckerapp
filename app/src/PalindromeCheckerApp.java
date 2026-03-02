public class PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "level";

        System.out.println("======================================");
        System.out.println("Use Case 3: Reverse String Palindrome Check");
        System.out.println("Input String: " + input);
        System.out.println("======================================");


        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }


        if (input.equals(reversed)) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        System.out.println("Reversed String: " + reversed);
        System.out.println("======================================");
    }
}