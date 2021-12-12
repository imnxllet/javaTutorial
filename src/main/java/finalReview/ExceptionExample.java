package finalReview;

public class ExceptionExample {
    private static void methodThatThrowsException() throws Exception {
        throw new Exception("This is a checked exception!");
    }

    public static void main(String[] args) {
        // try - catch logic
        //methodThatThrowsException();


        try {
            methodThatThrowsException();
        } catch (Exception ex) {
            System.out.println("Catch it!");
        }
    }
}
