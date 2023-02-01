package patterns.singleton;

import lombok.NoArgsConstructor;

/**
 * @author ef-jeymar
 */

/**
 * SINGLETON PATTERN
 *
 * Limits the class to have only one instantiation via a getInstance() method
 *
 * */
@NoArgsConstructor
public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
