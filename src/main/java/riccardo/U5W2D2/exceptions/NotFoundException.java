package riccardo.U5W2D2.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(long id){
        super("con id: " + id + " non trovato" );
    }
}
