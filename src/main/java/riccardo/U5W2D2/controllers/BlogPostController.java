package riccardo.U5W2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import riccardo.U5W2D2.entites.BlogPost;
import riccardo.U5W2D2.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping ("/blogpost")
public class BlogPostController {
    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    private List<BlogPost> getAllBlog(){
        return blogPostService.getBlogPostsList();
    }
    @GetMapping ("/{userId}")
    private BlogPost getBlogPostById(@PathVariable long id){
        return blogPostService.findBlogById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost postBlog(@RequestBody BlogPost body){
        return blogPostService.saveBlogPost(body);
    }

    @PutMapping ("/blogId")
    private BlogPost findBlogAndUpdate (@PathVariable long id, @RequestBody BlogPost body){
        return blogPostService.findBlogByIdAndUpdate(id, body);
    }

    @DeleteMapping ("/blogId")
    private void findBlogAndDelete (@PathVariable long id){
        blogPostService.deleteBlogPost(id);
    }
}
