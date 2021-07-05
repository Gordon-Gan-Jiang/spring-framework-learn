import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Gordon.Gan
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext("java");
        System.out.println("123");
    }
}
