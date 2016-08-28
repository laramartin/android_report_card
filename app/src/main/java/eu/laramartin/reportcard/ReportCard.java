package eu.laramartin.reportcard;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Lara on 28/08/2016.
 */
public class ReportCard {

    int studentId;
    // is final because it can't be modified
    final String schoolName = "Hogwarts";
    String messageToParents;
    // List of names of subjects in report card
    List<String> subjects;
    // List of every subject's grade in report card
    List<Integer> grades;
    // Number of days attended in every subject
    List<Integer> attendance;


    // constructor requires the studendId because is mandatory
    public ReportCard(int studentId) {
        this.studentId = studentId;
        this.subjects = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.attendance = new ArrayList<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getMessageToParents() {
        return messageToParents;
    }

    public void setMessageToParents(String messageToParents) {
        this.messageToParents = messageToParents;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public List<Integer> getAttendance() {
        return attendance;
    }

    public void setAttendance(List<Integer> attendance) {
        this.attendance = attendance;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "";
    }

    public String printReportCard() {
        return "";
    }


}
