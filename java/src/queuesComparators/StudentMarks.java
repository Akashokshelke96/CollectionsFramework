package queuesComparators;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    @Override
    public String toString() {
        return "studentMarks[" +
                "maths=" + maths +
                ", physics=" + physics +
                ']';
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }


    @Override
    public int compareTo(StudentMarks o) {
        /*
        currentObject < other object = return -1; (Return any negative number)
        currentObject > other object = return 1;
        currentObject = other object = return 0;
         */
        return o.maths - this.maths;
        /*
        Above code is just
        if(this.maths < o.math)
           return -1;
        if(this.maths > o.math)
           return 1;
        if(this.maths = o.math)
           return 0;
         */
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentMarks that)) return false;
        return getMaths() == that.getMaths() && getPhysics() == that.getPhysics();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaths(), getPhysics()) ;
    }
}
