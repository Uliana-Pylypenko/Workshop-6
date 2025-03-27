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


}
