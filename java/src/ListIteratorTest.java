import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        ListIterator<Integer> list2 = list.listIterator();
        System.out.println(list2.next());//gives 1
        System.out.println(list2.next());//gives 2
        System.out.println(list2.previous()); //gives 2, as it first moves the pointer to prev & then gives the value.
        // Next :  return items[index++];
        // Previous : return items[--index];

    }
}
