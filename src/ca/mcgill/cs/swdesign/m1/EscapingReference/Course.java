package ca.mcgill.cs.swdesign.m1.EscapingReference;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String aID;
    private int aCap;
    private List<Undergrad> aEnrollment;

    public Course(String pID, int pCap) {
        this.aID = pID;
        this.aCap = pCap;
        this.aEnrollment = new ArrayList<>();
    }

    public int getCap(){
        return aCap;
    }

    public boolean setEnrollment(List<Undergrad> pEnrollment) {
        if(pEnrollment.size()<=aCap) {
            aEnrollment = pEnrollment;
            return true;
        }
        return false;
    }

    public List<Undergrad> getEnrolledStudent() {
        return new ArrayList<> (aEnrollment);
    }

    public boolean enroll(Undergrad pStudent) {
        if(aEnrollment.size()<aCap) {
            aEnrollment.add(pStudent);
            return true;
        }
        return false;
    }

    public boolean enroll(List<Undergrad> pStudents) {
        if(aEnrollment.size() + pStudents.size()<=aCap) {
            aEnrollment.addAll(pStudents);
            return true;
        }
        return false;
    }

    public void printEnrolledStudent() {
        System.out.println(aID + ": ");
        for(Undergrad s: aEnrollment) {
            System.out.println(s);
        }
    }

    public boolean withdraw(Undergrad pStudent) {
        return aEnrollment.remove(pStudent);
    }

}
