import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 23.01.12
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */

public class InterfaceVsIterator {
    
    public static void display(Iterator<Pet> iterator) {
        while(iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
    }
    
    public static void display(Collection<Pet> collection) {
        for(Pet p : collection)
            System.out.print(p.id() + " " + p + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petsList = Pets.arrayList(8);
        Set<Pet> petsSet = new HashSet<Pet>(petsList);
        Map<String,Pet> petsMap = new LinkedHashMap<String, Pet>();
        
        String[] petsNames = ("Ralph, Eric, Robin, Lacey, " +
                "Britney, Sam, Spot, Fluffy").split(", ");
        
        for(int i = 0; i < 8; i++)
            petsMap.put(petsNames[i], petsList.get(i));
        
        display(petsList);
        display(petsSet);
        display(petsList.iterator());
        display(petsSet.iterator());
        
        System.out.println(petsMap);
        System.out.println(petsMap.keySet());
        
        display(petsMap.values());
        display(petsMap.values().iterator());
    }
}
