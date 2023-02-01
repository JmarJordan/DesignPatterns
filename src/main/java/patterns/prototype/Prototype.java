package patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import patterns.builder.Record;

import java.util.List;

/**
 * PROTOTYPE
 *
 * Implements the Cloneable interface for creating another instance of an object (duplicate)
 *
 * @author ef-jeymar
 * */
@AllArgsConstructor
@Data
public class Prototype implements Cloneable{

    private String sql;
    private List<String> params;
    private Record record;

    @Override
    public Prototype clone(){
        try{
            return (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }


}
