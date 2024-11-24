import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
//        GenericList<Integer> list = new GenericList<>();
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Iterator<Integer> iterator = list.iterator(); //since now our collection has implemented the iterable, we can also use for loop below
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for(int x:list){
//            System.out.println(x);
//        }


        //for arraylist we already have a toString() method.
        System.out.println(list);
        System.out.println("Element got replaced = " + list.set(2,100));
        System.out.println(list);

        System.out.println("printing another copied list");
        List<Integer> list2 = new ArrayList<>(list);
        list2.add(99);
        System.out.println(list2);
        System.out.println("Adding all elements of list1 to list2");
        list2.addAll(list);
        System.out.println(list2);

        //Sublist method only to show a part of list, it shallow copies
        // changes made in list3, will also be there in list2
        List<Integer> list3 = list2.subList(1,3);
        System.out.println("Sublist view of list 2 is "+list3);
        list3.set(0,9999);
        System.out.println("List 2 is now modified to "+list2);

    }
}
