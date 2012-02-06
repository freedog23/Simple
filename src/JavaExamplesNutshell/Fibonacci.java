package JavaExamplesNutshell;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a1 = 1, a2 = 1, a3;

        System.out.print("Числа Фибоначчи: " + a1 + ", " + a2 + ", ");
        
        for(int i = 0; i < 20; i++) {
            a3 = a1  + a2;
            a1 = a2;
            a2 = a3;
            
            System.out.print(a3 + ", ");
        }
    }
}
