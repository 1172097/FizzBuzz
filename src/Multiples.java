
public class Multiples {
    int x = 0
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {

                x = x + 1;

            } else if (divisibleBy3) {

                x = x + 1;

            } else if (divisibleBy5) {

                x = x + 1;

            }
            System.out.println(x);
} } }