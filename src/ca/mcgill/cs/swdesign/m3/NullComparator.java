package ca.mcgill.cs.swdesign.m3;

import java.util.Comparator;

public class NullComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
