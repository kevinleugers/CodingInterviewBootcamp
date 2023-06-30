import java.util.Hashtable;

public class Anagrams_9 {
    public static void main(String[] args) {
        Anagrams_9 anagrams9 = new Anagrams_9();
        System.out.println(anagrams9.anagrams("HeLlo! !$", "ohel! l"));
        System.out.println(anagrams9.anagrams("HeLlllo! !$", "ohell"));
    }

    public Boolean anagrams(String stringA, String stringB) {
        String cleanedA = stringA.replaceAll("[^\\w]+", "").toLowerCase();
        String cleanedB = stringB.replaceAll("[^\\w]+", "").toLowerCase();

        Hashtable<String,Integer> hashtableA = new Hashtable<>();
        for (char c :
                cleanedA.toCharArray()) {
            if (hashtableA.containsKey(String.valueOf(c))) {
                Integer num = hashtableA.get(String.valueOf(c));
                hashtableA.put(String.valueOf(c), num + 1);
            } else {
                hashtableA.put(String.valueOf(c), 1);
            }
        }

        Hashtable<String,Integer> hashtableB = new Hashtable<>();
        for (char c :
                cleanedB.toCharArray()) {
            if (hashtableB.containsKey(String.valueOf(c))) {
                Integer num = hashtableB.get(String.valueOf(c));
                hashtableB.put(String.valueOf(c), num + 1);
            } else {
                hashtableB.put(String.valueOf(c), 1);
            }
        }

        if (hashtableA.size() != hashtableB.size()) {
            return false;
        }

        for (String key :
                hashtableA.keySet()) {
            if (hashtableA.get(key) != hashtableB.get(key)) {
                return false;
            }
        }
        return true;
    }
}
