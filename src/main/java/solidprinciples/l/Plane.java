package solidprinciples.l;

import lombok.Data;

/**
 * @author ef-jeymar
 */

@Data
public abstract class Plane {
    String name;
    Integer numberOfWheels;
    String engineType;

    void goFly(){
        System.out.println(String.format("%s flew up high!",this.name));
    }
}
