package com.example.owner.minichallenge2;

/**
 * Created by owner on 26/3/2017.
 */

public class Course {
    int courseID, prereqID, capacity;
    String courseName, courseDescription;

    public Course(String courseID, String courseName){
        this.setCourseName(courseID);
        this.setCourseDescription(courseName);
    }

    public int getCourseID(){
        return this.courseID;
    }

    public int getPrereqID(){
        return this.prereqID;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseDescription(){
        return this.courseDescription;
    }

    public void setCourseID(int courseID){
        this.courseID = courseID;
    }

    public void setPrereqID(int prereqID){
        this.prereqID = prereqID;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCourseName(String courseDescription){
        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }


}
