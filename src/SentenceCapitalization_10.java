public class SentenceCapitalization_10 {
    public static void main(String[] args) {
        SentenceCapitalization_10 sentenceCapitalization10 = new SentenceCapitalization_10();
        System.out.println(sentenceCapitalization10.capitalize("hello there"));
        System.out.println(sentenceCapitalization10.capitalize("look! it is working!"));
    }

    public String capitalize(String str) {
        String[] stringArr = str.split(" ");
        String result = "";
        for (String word :
                stringArr) {
            String capitalizedWord = word.substring(0,1).toUpperCase() + word.substring(1);
            if (result == "") {
                result += capitalizedWord;
            } else {
                result += " " + capitalizedWord;
            }
        }
        return result;
    }
}
