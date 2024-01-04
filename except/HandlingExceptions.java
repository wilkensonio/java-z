package except;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            ThrowingExceptions throwingExceptions = new ThrowingExceptions();
            throwingExceptions.validNumber(-1);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
