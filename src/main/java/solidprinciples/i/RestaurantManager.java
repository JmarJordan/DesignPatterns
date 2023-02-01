package solidprinciples.i;

/**
 * @author ef-jeymar
 */

/**
 * This is a bad practice as far as Interface Segregation principle is concerned
 *
 * Even if a manager is capable of performing these tasks, it is better to separate these tasks into different
 * classes for specificity
 *
 * Interface Segregation - has a very similar concept with Single Responsibility principle in that it is best if
 * you create smaller more specific interfaces rather than a bulky interface that handles multiple tasks.
 * */
public interface RestaurantManager {
    void serveCustomer();
    void cookFood();
    void cleanRestaurant();
}
