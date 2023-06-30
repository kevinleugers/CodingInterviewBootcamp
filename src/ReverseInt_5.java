public class ReverseInt_5 {
    public static void main(String[] args) {
        System.out.println("Running Reverse Int");

        ReverseInt_5 reverseInt5 = new ReverseInt_5();

        System.out.println(reverseInt5.reverseInt(51));
        System.out.println(reverseInt5.reverseInt(-51));
        System.out.println(reverseInt5.reverseInt(-4000));
    }

    public Integer reverseInt(Integer n) {
        char[] chars = n.toString().toCharArray();
        String reversed = "";
        for (char c :
                chars) {
            if (c != '-') {
                reversed = c + reversed;
            }
        }


        return Integer.parseInt(reversed) * Integer.signum(n);
    }

}
