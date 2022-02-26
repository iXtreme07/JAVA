public class FizzBuzz {
    public static void fizzBuzz(int number) {

        if (number % 3 == 0 || number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.print("Fizz");
            }
            if (number % 5 == 0) {
                System.out.print("Buzz");
            }
        } else {
            System.out.print(number);
        }return;
    }
}
