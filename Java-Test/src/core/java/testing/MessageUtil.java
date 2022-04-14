package core.java.testing;

/**
 * @author ManhKM on 4/14/2022
 * @project Java-Test
 */
public class MessageUtil {
    private String message;

    public MessageUtil(String message){
        this.message = message;
    }

    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
