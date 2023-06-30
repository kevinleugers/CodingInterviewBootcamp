public class StringReversal_3 {
    public static void main(String[] args) {
        System.out.println("Running String Reversal");

        StringReversal_3 stringReversal3 = new StringReversal_3();
        System.out.println(stringReversal3.reverseString("hello"));
    }

    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i=str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
