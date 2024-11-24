package queuesComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());
        PriorityQueue<Integer> pq = new PriorityQueue<>( (a,b) -> b-a);
        pq.offer(1);
        pq.offer(2);
        pq.offer(9);
        pq.offer(0);
//        System.out.println("Elements in the queue are " + pq);

        List<Integer> list = new ArrayList<>();
        int index = 0 ;
        while(!pq.isEmpty()){
            if(index == 2)
                break;

            list.add(pq.poll());
            index++;
        }
//        System.out.println("List items are : " + list);

        //Get the top 3 elements from the queuesComparators.StudentMarks object list.
        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(70,80));
        studentMarks.add(new StudentMarks(72,84));
        studentMarks.add(new StudentMarks(73,87));
        studentMarks.add(new StudentMarks(74,80));
        studentMarks.add(new StudentMarks(75,84));

        PriorityQueue<StudentMarks> studentsPriorityQueue = new PriorityQueue<>(studentMarks);

        List<StudentMarks> top3 = new ArrayList<>();
        index = 0;
        while(!studentsPriorityQueue.isEmpty()){
            if(index == 3)
                break;

            top3.add(studentsPriorityQueue.poll());
            index++;
        }
//        System.out.println(top3);


        //what if we wnt bottom 2 elements instead of top 2;

        PriorityQueue<StudentMarks> studentsPriorityQueue2 = new PriorityQueue<>((s1,s2) -> s2.getPhysics() - s1.getPhysics());
        for(StudentMarks sm : studentMarks)
            studentsPriorityQueue2.add(sm);

        List<StudentMarks> bottom = new ArrayList<>();
        index = 0;
        while(!studentsPriorityQueue2.isEmpty()){
            if(index == 3)
                break;

            bottom.add(studentsPriorityQueue2.poll());
            index++;
        }
        System.out.println(bottom);
    }
}
