import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        
        Iterator<Pet> iterator = pets.iterator();
        
        while(iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
        
        for(Pet p : pets)
            System.out.print(p.id() + " " + p + " ");
        System.out.println();

        iterator = pets.iterator();

        for(int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }

        for(Pet p : pets)
            System.out.print(p.id() + " " + p + " ");
        System.out.println();
    }
}