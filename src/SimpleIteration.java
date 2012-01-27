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
        
        for(int i = 0; i < 6; i++)
            pets.remove(i);
        System.out.println(pets);
    }
}