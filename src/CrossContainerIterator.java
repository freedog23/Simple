import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIterator {
    
    public static void display(Iterator<Pet> iterator) {
        while(iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> petsAL = Pets.arrayList(12);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(petsAL);
        HashSet<Pet> petsHS = new HashSet<Pet>(petsAL);
        TreeSet<Pet> petsTS = new TreeSet<Pet>(petsAL);
        
        display(petsAL.iterator());
        display(petsLL.iterator());
        display(petsHS.iterator());
        display(petsTS.iterator());
    }
}