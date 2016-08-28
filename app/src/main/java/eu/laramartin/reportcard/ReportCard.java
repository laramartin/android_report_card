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
    // List of every subject's grade in report card.
    // Grades go from 0 to 10 (< 5 means failed)
    // Grade system from Spain
    List<Integer> grades;
    // Number of days attended in every subject
    List<Integer> attendance;


    // constructor requires the studentId because is mandatory
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

    public float getAverageGrade(){
        int sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        float averageGrade = sum / grades.size();
        return averageGrade;
    }

    public String getStringOfOneSubjectWithGradeAndAttendance(int index) {
        List<String> subjects = getSubjects();
        List<Integer> grades = getGrades();
        List<Integer> attendance = getAttendance();

        String subjectWithGradeAndAttendance = subjects.get(index) + " with grade " +
                Integer.toString(grades.get(index)) + " with " +
                Integer.toString(attendance.get(index)) + " days of attendance";

        return subjectWithGradeAndAttendance;
    }

    public String getStringOfAllSubjectsWithGradesAndAttendance() {
        String allSubjectsWithGradesAndAttendance = "";

        for (int i = 0; i < subjects.size(); i++) {
            allSubjectsWithGradesAndAttendance +=
                    (getStringOfOneSubjectWithGradeAndAttendance(i) + "\n");
        }

        return allSubjectsWithGradesAndAttendance;
    }

    @Override
    public String toString() {
        String filledReportCard = "Student ID: " + Integer.toString(studentId) + "\n" +
                "School: " + getSchoolName() + "\n" +
                "Subjects evaluated:\n" +
                getStringOfAllSubjectsWithGradesAndAttendance() +
                "Average grade: " + getAverageGrade() + "\n"+
                "Message from the teacher: " + getMessageToParents();
        return filledReportCard;
    }
}
