package ca.mcgill.cs.swdesign.m3;

import java.util.Comparator;

public class Undergrad implements Student {
    final private String aID;
    final private String aFirstName;
    final private String aLastName;

    public Undergrad(String pID, String pFirstName, String pLastName) {
        assert pID!= null && pFirstName!=null && pLastName!=null;
        this.aID = pID;
        this.aFirstName = pFirstName;
        this.aLastName = pLastName;
    }

    @Override
    public String getFirstName() {
        return aFirstName;
    }

    @Override
    public String getLastName() {
        return aLastName;
    }

    @Override
    public Comparator<Student> getIDComparator() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getID().compareTo(o2.getID());
            }
        };
    }

    @Override
    public String getID() {
        return aID;
    }

    @Override
    public String toString() {
        return aID + ", " + aFirstName + ", " + aLastName;
    }

}