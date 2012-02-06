package JavaExamplesNutshell;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {
    public static void main(String[] args) {

        for(int i = 1; i < 1000; i++) {
            if (((i % 5) == 0) && ((i % 7) == 0))
                System.out.println("FizzBuzz " + "i = " + i);
            else if (i % 5 == 0)
                System.out.println("Fizz " + "i = " + i);
            else if (i % 7 == 0)
                System.out.println("Buzz " + "i = " + i);
        }
    }
}
