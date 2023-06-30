import java.util.stream.IntStream;

public class FizzBuzz_7 {
    public static void main(String[] args) {
        FizzBuzz_7 fizzBuzz7 = new FizzBuzz_7();
        fizzBuzz7.fizzBuzz((15));
    }

    public void fizzBuzz(Integer num) {
        IntStream.range(1, num + 1).forEach(n -> {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (n % 3 == 0) {
                System.out.println("fizz");
            } else if (n % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(n);
            }
        });
    }
}
