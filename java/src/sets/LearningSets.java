package sets;

import queuesComparators.StudentMarks;

import java.util.*;

public class LearningSets {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);


        Set<Integer> set = new HashSet<>(list);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(7);
        set2.add(9);
        set2.add(0);


        set.retainAll(set2);

//        System.out.println("Set : " +  set);
//        System.out.println("Set 2 : " +  set2);
//
//        System.out.println("After Retaining... ");
//        set.retainAll(set2);
//        System.out.println("Retained item in set 2 are : "  + set);
//
//
//        System.out.println("Linked Hashset : ");

        Set<Integer> set3 = new HashSet<>();
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(7);
        set3.add(9);
        set3.add(0);


        Set<Integer> set4 = new LinkedHashSet<>();
        set4.add(6);
        set4.add(2);
        set4.add(11);
        set4.add(4);
        set4.add(7);
        set4.add(0);
//        for (int x: set3
//        ) {
//            System.out.println("Set 3 values are  : " + x);
//        }
//        System.out.println(" Linked hashset below: retains order");
//        for (int x: set4
//             ) {
//            System.out.println("Set 4 values are  : " + x);
//
//        }


        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(70,80));
        studentMarks.add(new StudentMarks(72,84));
        studentMarks.add(new StudentMarks(73,87));
        studentMarks.add(new StudentMarks(74,80));
        studentMarks.add(new StudentMarks(75,84));



        Set<StudentMarks> studentSet = new HashSet<>(studentMarks);

        System.out.println(studentSet);

        System.out.println("Does studentMarks contains this student : " + studentSet.contains(new StudentMarks(75,84)));
    }
}
