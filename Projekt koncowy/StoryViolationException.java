import java.lang.RuntimeException;
public class StoryViolationException extends RuntimeException{

    public StoryViolationException(String message){
    super(message);
    
    }
    public void printMessage(){
        System.out.println(super.getMessage());
    
    }
}
