import com.manhkm.simple.RunnableSimple;
import com.manhkm.simple.ThreadSimple;

/**
 * @author ManhKM on 1/19/2022
 * @project Java-Thread
 */
public class RunnableSimpleMain {
    public static void main(String[] args) {
        RunnableSimple runnableSimple = new RunnableSimple();
        Thread t1 = new Thread(runnableSimple);
        t1.start();
    }
}
