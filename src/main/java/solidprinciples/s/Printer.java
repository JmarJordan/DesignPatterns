package solidprinciples.s;

/**
 * @author ef-jeymar
 */

/**
 * Instead of implementing a print() method on the Book class which violates the scope of the class,
 * Create a new class called Printer that does the printing.
 *
 * Single Responsibility means that a class should only have variables and methods within the class' scope of responsibility
 *
 * Methods that perform operations relating to that class should be present in a new class as it is not within the scope
 * */
public class Printer {

    void printBookContent(Book book){
        System.out.println(book.getContent());
    }
}
