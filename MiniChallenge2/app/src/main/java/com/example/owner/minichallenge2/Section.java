package com.example.owner.minichallenge2;

/**
 * Created by owner on 26/3/2017.
 */

public class Section {
    int secID, courseID, profID, bldgID;
    String secName;

    public int getSecID() {
        return this.secID;
    }

    public int getCourseID() {
        return this.courseID;
    }

    public int getProfID() {
        return this.profID;
    }

    public int getBldgID() {
        return this.bldgID;
    }

    public String getSecName() {
        return this.secName;
    }

    public void setSecID(int secID) {
        this.secID = secID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public void setBldgID(int bldgID) {
        this.bldgID = bldgID;
    }
}
