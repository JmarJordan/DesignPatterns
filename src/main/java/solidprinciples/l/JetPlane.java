package solidprinciples.l;

import lombok.Data;

/**
 * @author ef-jeymar
 */

/**
 * This JetPlane class is a subclass of the Plane class
 * If a program that uses the Plane class replaced it with the JetPlane class,
 * it would not harm the program
 *
 * Liskov Substitution - this principle basically means that any subclass of a class can serve as a replacement
 * without breaking the program
 *
 * */
@Data
public class JetPlane extends Plane {
    Integer hasThrusters;

    @Override
    void goFly() {
        System.out.println(String.format("%s flew very fast!", super.name));
    }
}
