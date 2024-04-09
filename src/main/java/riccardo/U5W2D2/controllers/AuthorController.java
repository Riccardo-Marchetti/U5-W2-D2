package riccardo.U5W2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import riccardo.U5W2D2.entites.Author;
import riccardo.U5W2D2.entites.BlogPost;
import riccardo.U5W2D2.services.AuthorService;
import riccardo.U5W2D2.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping ("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    private List<Author> getAuthorList(){
        return authorService.getAuthorList();
    }
    @GetMapping ("/authorId")
    private Author getAuthor (@PathVariable long id){
        return authorService.findAuthorById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Author postAuthor (@RequestBody Author body) {
        return authorService.saveAuthor(body);
    }

    @PutMapping ("/authorId")
    private Author findAuthorByIdAndUpdate(@PathVariable long id, @RequestBody Author body ){
        return authorService.findAuthorByIdAndUpdate(id, body);
    }

    @DeleteMapping ("/authorId")
    private void deleteAuthor(long id){
        authorService.deleteAuthor(id);
    }
}
