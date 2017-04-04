package com.example.owner.minichallenge2;

/**
 * Created by owner on 26/3/2017.
 */

public class Enlistment {
    int enlistID, courseID, userID, timeStart, timeEnd;
    boolean isPassed, isComplete, inOngoing;

    public int getEnlistID() {
        return enlistID;
    }

    public void setEnlistID(int enlistID) {
        this.enlistID = enlistID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(int timeStart) {
        this.timeStart = timeStart;
    }

    public int getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(int timeEnd) {
        this.timeEnd = timeEnd;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public boolean isInOngoing() {
        return inOngoing;
    }

    public void setInOngoing(boolean inOngoing) {
        this.inOngoing = inOngoing;
    }
}
