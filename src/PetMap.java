import typeinfo.pets.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 23.01.12
 * Time: 2:27
 * To change this template use File | Settings | File Templates.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My cat", new Cat("Molly"));
        petMap.put("My dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        
        System.out.println(petMap);
        Pet dog = petMap.get("My dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My dog"));
        System.out.println(petMap.containsValue(dog));

    }
}
