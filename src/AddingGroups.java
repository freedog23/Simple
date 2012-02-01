import java.util.*;

public class AddingGroups {

    public static void main(String[] args) {

        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        
        Integer[] moreInt = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInt));
        
        Collections.addAll(collection, 11, 12, 13, 14, 15);

        for(Integer i : collection)
            System.out.print(i + " ");
        
        List<Integer> list = Arrays.asList(15, 17, 18, 19, 20);

        list.set(0, 16);
        list.add(21); // ошибка времени выполнения нижележащий массив не должен изменяться в размерах.

        
        collection.addAll(list);

        System.out.println();
        for(Integer i : collection)
            System.out.print(i + " ");
    }
}
