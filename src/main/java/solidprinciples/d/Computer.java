package solidprinciples.d;

/**
 * @author ef-jeymar
 */

/**
 * Dependency Inversion - it is mainly used to promote decoupling by introducing abstraction in the code.
 *
 *
 * */
public class Computer {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Computer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
