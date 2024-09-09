package exceptions;

public class RethrowExample {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            // Rethrow the exception to be handled by the caller
            System.out.println("Caught in method1, rethrowing...");
            throw e;
        }
    }

    public static void method2() throws Exception {
        throw new Exception("Exception from method2");
    }
}
