package pl.coderslab.workshop6;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private final JpaBookService jpaBookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return jpaBookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return jpaBookService.get(id).orElse(null);
    }

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        jpaBookService.add(book);
        return "Book added";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        Optional<Book> bookToDelete = jpaBookService.get(id);
        if (bookToDelete.isPresent()) {
            jpaBookService.delete(id);
            return "Book deleted";
        }
        return "Book not found";
    }

    @PutMapping("/update/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody Book book) {
        Optional<Book> bookToUpdate = jpaBookService.get(id);
        if (bookToUpdate.isPresent()) {
            bookToUpdate.get().setTitle(book.getTitle());
            bookToUpdate.get().setAuthor(book.getAuthor());
            bookToUpdate.get().setPublisher(book.getPublisher());
            bookToUpdate.get().setIsbn(book.getIsbn());
            bookToUpdate.get().setType(book.getType());
            jpaBookService.update(bookToUpdate.get());
            return "Book updated";
        }
        return "Book not found";
    }
}
