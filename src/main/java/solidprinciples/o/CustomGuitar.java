package solidprinciples.o;

import java.util.List;

/**
 * @author ef-jeymar
 */

/**
 * Adding new features to an existing class may result in unexpected bugs.
 * Which is why creating a class with the new feature that extends the existing one is more reliable.
 *
 * Open for Extension Closed for Modification - extending an existing class in order to add a new feature is more reliable
 * because it does not explicitly require any modification to the parent class.
 * */
public class CustomGuitar extends Guitar{
    List<String> accessories;
}
