package riccardo.U5W2D2.services;

import org.springframework.stereotype.Service;
import riccardo.U5W2D2.entites.Author;
import riccardo.U5W2D2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    List<Author> authorList = new ArrayList<>();

    public List<Author> getAuthorList(){
        return authorList;
    }

    public Author saveAuthor(Author body){
        Random random = new Random();
        body.setId(random.nextInt(1, 10000));
        authorList.add(body);
        return body;
    }

    public Author findAuthorById(long id){
        Author found = null;
        for (Author author : this.authorList ) {
            if (author.getId() == id) {
                found = author;
            }
        }
        if (found == null) {
            throw new NotFoundException(id);
        } else {
            return found;
        }
    }

    public Author findAuthorByIdAndUpdate(long id, Author authorUpdate){
        Author found = null;
        for (Author author : this.authorList ) {
            if (author.getId() == id) {
                found = author;
                author.setName(authorUpdate.getName());
                author.setLastName(authorUpdate.getLastName());
                author.setEmail(authorUpdate.getEmail());
                author.setDateOfBirth(authorUpdate.getDateOfBirth());
            }
        }
        if (found == null) {
            throw new NotFoundException(id);
        } else {
            return found;
        }
    }

    public void deleteAuthor(long id){
        Iterator<Author> iterator = this.authorList.iterator();

        while (iterator.hasNext()){
            Author author = iterator.next();
            if (author.getId() == id){
                iterator.remove();
            }
        }
    }
}
