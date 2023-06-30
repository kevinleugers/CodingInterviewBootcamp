import java.util.Hashtable;

public class MaxChar_6 {
    public static void main(String[] args) {
        System.out.println("Running Max Char");

        MaxChar_6 maxChar6 = new MaxChar_6();
        System.out.println(maxChar6.maxChar(("abcccddeefggggg")));
        System.out.println(maxChar6.maxChar(("abc!!ccddeefg@@@@@gg!!!!!")));

    }

    public String maxChar(String str) {
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        for (char c :
                str.toCharArray()) {
            if (hashtable.containsKey(String.valueOf(c))) {
                Integer num = hashtable.get(String.valueOf(c));
                hashtable.put(String.valueOf(c), num + 1);
            } else {
                hashtable.put(String.valueOf(c), 1);
            }
        }
        Integer maxNum = 0;
        String max = "";
        for (String k :
                hashtable.keySet()) {
            if (hashtable.get(k) > maxNum) {
                max = k;
                maxNum = hashtable.get(k);
            }
        }

        return max;
    }
}
