package riccardo.U5W2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riccardo.U5W2D2.services.BlogPostService;

@RestController
@RequestMapping ("/author")
public class AuthorController {

    @Autowired
    private BlogPostService blogPostService;


}
