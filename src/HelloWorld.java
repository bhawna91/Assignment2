import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Bhawna
 * Date: 9/7/12
 * Time: 7:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld {
    public static void main(String[] argv) throws IOException {
        BufferedReader buff = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("What's your name? ");
        System.out.flush();
        String s = buff.readLine();
        System.out.printf("Hello, %s!", s);
    }
}
