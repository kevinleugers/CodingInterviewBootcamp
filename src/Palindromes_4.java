public class Palindromes_4 {
    public static void main(String[] args) {
        System.out.println("Running Palindromes");

        Palindromes_4 palindromes4 = new Palindromes_4();
        System.out.println(palindromes4.isPalindrome("hello"));
        System.out.println(palindromes4.isPalindrome("abcba"));
        System.out.println(palindromes4.isPalindrome("hellooh"));
    }

    public Boolean isPalindrome(String str) {
        String reversed = "";
        for (char ch : str.toCharArray()) {
            reversed = ch + reversed;
        }
        return str.equals(reversed);
    }
}
