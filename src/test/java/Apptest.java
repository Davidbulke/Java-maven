import com.example.Apllication;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyApp {
    public static void main(String[] args) {
        // Initialize the application
        Application app = new Application();

        // Call a function and print the result
        int result = app.addNumbers(5, 7);
        System.out.println("The result is: " + result);
    }
}

class Application {
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
