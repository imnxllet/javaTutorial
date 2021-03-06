package basics.exception;

public class MainProgram {
    public static void main(String[] args)  {

        try {
            DatabaseConnection.connectToDb();
        } catch (DatabaseException ex) {
            // helpful exception method to know why an exception happens
            System.out.println(ex.getMessage());
        }

        DatabaseConnection.talkToDb();

        try {
            DatabaseConnection.talkToDb();
        } catch (DatabaseRunTimeException ex) {
            // helpful exception method to know why an exception happens
            System.out.println(ex.getMessage());
        }

        System.out.println("hello!!");
    }
}
