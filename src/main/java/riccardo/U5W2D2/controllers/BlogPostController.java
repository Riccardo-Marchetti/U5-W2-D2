package riccardo.U5W2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
//    @GetMapping
//    private BlogPost getBlogPostById(){
//
//    }

    @
}
