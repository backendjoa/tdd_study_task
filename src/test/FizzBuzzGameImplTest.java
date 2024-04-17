package test;

import main.java.FizzBuzzGameImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzGameImplTest {

    @Test
    @DisplayName("입력받은 숫자가 0 또는 Fizz, Buzz, FizzBuzz에 해당하지 않는 경우 fail을 반환한다.")
    void fail() {

        String failValue = getFizzBuzzGame().playGame(0);
        Assertions.assertEquals(failValue, "Fail");
    }

    @Test
    @DisplayName("입력받은 숫자가 3의 배수일 경우 Fizz를 반환한다.")
    void Fizz() {

            String fizzValue = getFizzBuzzGame().playGame(3);
            Assertions.assertEquals(fizzValue, "Fizz");
        }

    @Test
    @DisplayName("입력받은 숫자가 5의 배수일 경우 Buzz를 반환한다.")
    void Buzz() {

            String buzzValue = getFizzBuzzGame().playGame(5);
            Assertions.assertEquals(buzzValue, "Buzz");
    }

    @Test
    @DisplayName("입력받은 숫자가 3과 5의 공배수일 경우 FizzBuzz를 반환한다.")
    void FizzBuzz() {

            String FizzBuzz = getFizzBuzzGame().playGame(15);
            Assertions.assertEquals(FizzBuzz, "FizzBuzz");
    }

    private static FizzBuzzGameImpl getFizzBuzzGame() {

        FizzBuzzGameImpl fizzBuzzGame = new FizzBuzzGameImpl();
        return fizzBuzzGame;
    }
}