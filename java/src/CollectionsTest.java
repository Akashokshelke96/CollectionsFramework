import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Iterator<Integer> iterator = list.iterator(); //since now our collection has implemented the iterable, we can also use for loop below
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for(int x:list){
            System.out.println(x);
        }

    }
}
