public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        if (text == null) return false;

        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        ArrayStack<Character> stack = new ArrayStack<>(cleaned.length());

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        for (int i = 0; i < cleaned.length(); i++) {
            Character c = stack.pop();
            if (c == null || c.charValue() != cleaned.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Anita lava la tina";
        String s2 = "Hola";
        System.out.printf("\"%s\" → %b%n", s1, isPalindrome(s1)); // true
        System.out.printf("\"%s\" → %b%n", s2, isPalindrome(s2)); // false
    }
}
