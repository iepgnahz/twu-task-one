public class FizzBuzzExercise {
    public static void main(String[] args) {
        FizzBuzzExercise fizzBuzzExercise = new FizzBuzzExercise();
        fizzBuzzExercise.fizzBuzz();
    }

    public String getAnswer(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return n + "";
    }

    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(this.getAnswer(i));
        }
    }
}
