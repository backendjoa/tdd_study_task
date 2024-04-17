package main.java;

public class FizzBuzzGameImpl implements FizzBuzzgame{

    public String playGame(int number) {

        if(number == 0) {
            return "Fail";
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return "Fail";
    }
}
