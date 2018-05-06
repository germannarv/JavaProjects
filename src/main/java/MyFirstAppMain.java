public class MyFirstAppMain {

    public static void main(String args[]) {
        try {
            final String WELCOME_MESSAGE = "Hello, are you ready for the action?";
            System.out.println(WELCOME_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("El método principal ha finalizado.");
        }
    }
}