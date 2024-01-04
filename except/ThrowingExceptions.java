package except;

public class ThrowingExceptions {

    void validNumber(int number){
        if (number < 0)
            throw new IllegalArgumentException("Number must be positive");
    }
}
