//@FunctionalInterface
public interface FunctionalInterface {
    void execute();

    // You can have other non-abstract methods like default methods
    default void printMessage(String message) {
        System.out.println(message);
    }
}
