package pl.coderslab.workshop6;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getBooks();

    Optional<Book> get(Long id);

    void add(Book book);

    void delete(Long id);

    void update(Book book);
}

//list.add(new Book(4L, "978-1-491-91465-6", "Effective Java", "Joshua Bloch", "Addison-Wesley", "Programming"));
//list.add(new Book(5L, "978-1-449-39317-0", "Head First Design Patterns", "Eric Freeman", "O'Reilly Media", "Software Engineering"));
//list.add(new Book(6L, "978-0-134-35497-5", "Introduction to Algorithms", "Thomas H. Cormen", "MIT Press", "Algorithms"));
//list.add(new Book(7L, "978-0-201-63361-0", "The Art of Computer Programming", "Donald E. Knuth", "Addison-Wesley", "Programming"));
//list.add(new Book(8L, "978-0-13-235088-4", "Agile Software Development", "Robert C. Martin", "Prentice Hall", "Software Engineering"));
//list.add(new Book(9L, "978-0-262-03384-8", "Structure and Interpretation of Computer Programs", "Harold Abelson", "MIT Press", "Programming"));
//list.add(new Book(10L, "978-0-596-51774-8", "Refactoring: Improving the Design of Existing Code", "Martin Fowler", "Addison-Wesley", "Programming"));


