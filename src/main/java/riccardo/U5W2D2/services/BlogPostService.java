package riccardo.U5W2D2.services;

import org.springframework.stereotype.Service;
import riccardo.U5W2D2.entites.BlogPost;
import riccardo.U5W2D2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    List<BlogPost> blogPostsList = new ArrayList<>();

    public List<BlogPost> getBlogPostsList(){
        return blogPostsList;
    }

    public BlogPost saveBlogPost(BlogPost body){
        Random random = new Random();
        body.setId(random.nextInt(1, 10000));
        blogPostsList.add(body);
        return body;
    }

    public BlogPost findBlogById (long id){
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPostsList) {
            if (blogPost.getId() == id) {
                found = blogPost;
            }
        }
        if (found == null){
            throw new NotFoundException(id);
        } else {
            return found;
        }
    }

    public BlogPost findBlogByIdAndUpdate (long id, BlogPost blogPostUpdate){
        BlogPost found = null;
        for (BlogPost blogPost : this.blogPostsList) {
            if (blogPost.getId() == id) {
                found = blogPost;
                found.setCategory(blogPostUpdate.getCategory());
                found.setTitle(blogPostUpdate.getTitle());
                found.setCover(blogPostUpdate.getCover());
                found.setContent(blogPostUpdate.getContent());
                found.setReadingTime(blogPostUpdate.getReadingTime());
            }
        }
        if (found == null){
            throw new NotFoundException(id);
        } else {
            return found;
        }

    }

    public void deleteBlogPost(long id){
        Iterator<BlogPost> iterator = blogPostsList.iterator();
        while (iterator.hasNext()) {
            BlogPost blogPost = iterator.next();
            if (blogPost.getId() == id) {
                iterator.remove();
            }
        }
    }
}
